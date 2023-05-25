package aplicationForOnlineStore;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;

public class SignOutMenu implements Menu{

private AplicationContext context;
	
	{
		context = AplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign Out *****");
		System.out.println("Have a nice day! Look forward to welcoming back!");	
	}
}
