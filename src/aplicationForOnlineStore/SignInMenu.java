package aplicationForOnlineStore;

import java.util.Scanner;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;
import aplicationForOnlineStore.User;
import aplicationForOnlineStore.UserManagementService;
import aplicationForOnlineStore.DefaultUserManagementService;

public class SignInMenu implements Menu{
	private AplicationContext context;
	private UserManagementService userManagementService;

	{
		context = AplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter your email : ");
		String userEmail = scanner.next();
		
		System.out.print("enter your password : ");
		String userPassword = scanner.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("glad to see you back %S %S", user.getFirstName(),user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password doesn't exist");
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign In *****");	
	}
}
