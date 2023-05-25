package aplicationForOnlineStore;

import java.util.Scanner;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;

public class ChangeEmailMenu implements Menu{
	private AplicationContext context;
	{
		context = AplicationContext.getInstance();
	}
	@Override
	public void start() {
		printMenuHeader();
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		context.getLoggedInUser().setEmail(userInput);
		System.out.println("Your email has been successfully changed");
		new MainMenu().start();
	}
	
	@Override
	public void printMenuHeader() {
		System.out.println("change email");
		System.out.print("enter new email, please : ");
	}

}
