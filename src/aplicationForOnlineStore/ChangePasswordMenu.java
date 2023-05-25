package aplicationForOnlineStore;
import java.util.Scanner;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;

public class ChangePasswordMenu implements Menu{

private AplicationContext context;
	
	{
		context = AplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		context.getLoggedInUser().setPassword(userInput);
		System.out.println("Your password has been successfully changed");
		new MainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHANGE PASSWORD *****");
		System.out.print("Enter new password: ");			
	}
}
