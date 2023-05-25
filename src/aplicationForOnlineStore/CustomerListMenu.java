package aplicationForOnlineStore;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;
import aplicationForOnlineStore.User;
import aplicationForOnlineStore.UserManagementService;
import aplicationForOnlineStore.DefaultUserManagementService;

public class CustomerListMenu implements Menu{
	private AplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = AplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		User[] users = userManagementService.getUsers();
		
		if (users.length ==0) {
			System.out.println("There are no customers.");
		} else {
			for (User user : users) System.out.println(user);
		}
		context.getMainMenu().start();
	
	}

	@Override
	public void printMenuHeader() {
		System.out.println("USERS");
	}
}
