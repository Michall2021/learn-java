package aplicationForOnlineStore;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;
import aplicationForOnlineStore.OrderManagementService;
import aplicationForOnlineStore.Order;
import aplicationForOnlineStore.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu{
	private AplicationContext context;
	private OrderManagementService orderManagementService;

	{
		context = AplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		if (context.getLoggedInUser()==null) {
			System.out.println(
					"Please, log in or create new account to see list of your orders");
			new MainMenu().start();
			return;
		} else {
			printUsersOrdersToConsole();
		}
		new MainMenu().start();
		
		
	}

	private void printUsersOrdersToConsole() {
		Order[] loggedInUserOrders = orderManagementService.getOrdersByUserId(context.getLoggedInUser().getId());
		if (loggedInUserOrders == null || loggedInUserOrders.length == 0) {
			System.out.println("Unfortunately, you don't have any orders yet. "
					+ "Navigate back to main menu to place a new order");
		} else {
			for(Order order : loggedInUserOrders) {
				System.out.println(order);
			}
		}
		
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("My orders");		
	}

}
