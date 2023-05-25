package aplicationForOnlineStore;

import java.util.Scanner;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.User;
import aplicationForOnlineStore.DefaultUser;
import aplicationForOnlineStore.Menu;
import aplicationForOnlineStore.DefaultUserManagementService;
import aplicationForOnlineStore.UserManagementService;

public class SignUpMenu implements Menu{

	private UserManagementService userManagementService;
	private AplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = AplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = scanner.next();
		System.out.print("Please, enter your last name: ");
		String lastName = scanner.next();
		System.out.print("Please, enter your password: ");
		String password = scanner.next();
		System.out.print("Please, enter your email: ");
		
		scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		
		User user = new DefaultUser(firstName,lastName,password,email);
		
		String errorMessage = userManagementService.registeredUser(user);
		if (errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		}else {
			System.out.println(errorMessage);
		}
	context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN UP *****");	
	}

}
