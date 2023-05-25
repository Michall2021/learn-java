package aplicationForOnlineStore;

import aplicationForOnlineStore.Cart;
import aplicationForOnlineStore.User;
import aplicationForOnlineStore.DefaultCart;
import aplicationForOnlineStore.Menu;


public class AplicationContext {

	
	private static AplicationContext instance;
	
	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;
	
	private AplicationContext() {}
	
	public void setLoggedInUser(User user) {
		if(this.sessionCart != null) {this.sessionCart.clear();
		}
		this.loggedInUser=user;
	}
	public User getLoggedInUser() {
		return this.loggedInUser;
	}
	public void setMainMenu(Menu menu) {
		this.mainMenu = menu;
	}
	
	public Menu getMainMenu() {
		return this.mainMenu;
	}
	
	public static AplicationContext getInstance() {
		if (instance == null) {
			instance = new AplicationContext();
		}
		return instance;
	}
	public Cart getSessionCart() {
		if(this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}
	
}
