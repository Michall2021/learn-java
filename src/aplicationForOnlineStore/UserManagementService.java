package aplicationForOnlineStore;

import aplicationForOnlineStore.User;

public interface UserManagementService {
	
	String registeredUser(User user);
	User[] getUsers();
	User getUserByEmail(String userEmail);

}
