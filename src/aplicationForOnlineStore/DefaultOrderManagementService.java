package aplicationForOnlineStore;

import java.util.Arrays;
import aplicationForOnlineStore.Order;
import aplicationForOnlineStore.OrderManagementService;

public class DefaultOrderManagementService implements OrderManagementService{
	private static final int DEFAULT_ORDER_CAPACITY = 10;
	private static DefaultOrderManagementService instance;
	private int lastIndex;
	private Order[] orders;
	
	public static OrderManagementService getInstance() {
		if (instance ==null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}

	@Override
	public void addOrder(Order order) {
		if (order == null) return;
		if (orders.length <= lastIndex) orders = Arrays.copyOf(orders, orders.length);
		orders[lastIndex++] = order;
		
	}
	@Override
	public Order[] getOrdersByUserId(int userId) {
		int amountOfOrders = 0;
		for (Order order : orders) {
		if	(order != null && order.getCustomerId()== userId) amountOfOrders++;
		}
		
		Order[] userOrders = new Order[amountOfOrders];
		
		int index = 0;
		for (Order order : orders) {
			if (order != null && order.getCustomerId() == userId) {
				userOrders[index++] = order;
			}
		}
		return userOrders;
	}
	@Override
	public Order[] getOrders() {
		
		int nonNullOrdersAmount = 0;
		for (Order order : orders) {
			if (order != null) nonNullOrdersAmount++;
		}
		Order[] nonNullOrders = new Order[nonNullOrdersAmount];
		
		int index = 0;
		for(Order order : orders) {
			if (order != null) nonNullOrders[index++]  = order; 
		}
		
		
		return nonNullOrders;
		
	}
	void clearServiceState() {
		lastIndex = 0;
		orders = new Order[DEFAULT_ORDER_CAPACITY];
	}
	
}
