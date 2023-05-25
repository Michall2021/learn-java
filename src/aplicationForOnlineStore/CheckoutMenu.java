package aplicationForOnlineStore;

import java.util.Scanner;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;
import aplicationForOnlineStore.Order;
import aplicationForOnlineStore.DefaultOrder;
import aplicationForOnlineStore.OrderManagementService;
import aplicationForOnlineStore.DefaultOrderManagementService;

public class CheckoutMenu implements Menu{
	private AplicationContext context;
	private OrderManagementService orderManagementService;
	
	{
		context = AplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		while (true) {
			printMenuHeader();
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.next();
			
			if (!createOrder(userInput)) {
				continue;
			}
			context.getSessionCart().clear();
			break;
		}
		System.out.println("Thanks a lot for your purchase. "
				+ "Details about order delivery are sent to your email.");
		new MainMenu().start();
		
	}

	private boolean createOrder(String creditCardNumber) {
		

		Order order = new DefaultOrder();
		if (!order.isCreditCardNumberValid(creditCardNumber)) {
			return false;
		}
		order.setCreditCardNumber(creditCardNumber);
		order.setProducts(context.getSessionCart().getProducts());
		order.setCustomerId(context.getLoggedInUser().getId());
		orderManagementService.addOrder(order);
		return true;
				
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHECKOUT *****");
		System.out.print(
				"Enter your credit card number without spaces and press enter if you confirm purchase: ");
		
	}

}
