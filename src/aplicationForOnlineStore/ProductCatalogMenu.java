package aplicationForOnlineStore;

import aplicationForOnlineStore.AplicationContext;
import aplicationForOnlineStore.Menu;
import aplicationForOnlineStore.Cart;

import aplicationForOnlineStore.Product;
import aplicationForOnlineStore.ProductManagementService;
import aplicationForOnlineStore.DefaultProductManagementService;

import java.util.Scanner;

public class ProductCatalogMenu implements Menu{

	private static final String CHECKOUT_COMMAND = "checkout";
	private AplicationContext context;
	private ProductManagementService productManagementService;

	{
		context = AplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}

	@Override
	public void start() {
		Menu menuToNavigate = null;
		while (true) {
			printMenuHeader();
			printProductsToConsole();
			
			String userInput = readUserInput();
			
			if (context.getLoggedInUser() == null) {
				menuToNavigate = new MainMenu();
				System.out.println("You are not logged in. Please, sign in or create new account");
				break;
			}
			if (userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
				menuToNavigate = new MainMenu();
				break;
			}
			if(userInput.equalsIgnoreCase(CHECKOUT_COMMAND)){
				Cart sessionCart = context.getSessionCart();
				if (sessionCart == null || sessionCart.isEmpty()) {
					System.out.println("Your cart is empty. Please, "
							+ "add product to cart first and then proceed with checkout");
				} else {
					menuToNavigate = new CheckoutMenu();
					break;
				}
			}else {
				Product productAddToCart = fetchProduct(userInput);
				
				if(productAddToCart == null) {
					System.out.println("Please, enter product ID if you want to add product to cart. Or enter 'checkout' if you want to proceed with checkout. Or enter 'menu' if you want to navigate back to the main menu.");
					continue;
				}
				processAddToCart(productAddToCart);
			}
		}
		menuToNavigate.start();
		
	}
	
	private Product fetchProduct(String userInput) {
		int productIdToAddToCart = Integer.parseInt(userInput);
		Product productToAddToCart = productManagementService.getProductById(productIdToAddToCart);
		return productToAddToCart;
	}

//	@SuppressWarnings("null")
	private void processAddToCart(Product productAddToCart) {
		context.getSessionCart().addProduct(productAddToCart);
//		Product productToAddToCart = null;
		System.out.printf("Product %s has been added to your cart. "
				+ "If you want to add a new product - enter the product id. "
				+ "If you want to proceed with checkout - enter word "
				+ "'checkout' to console %n", productAddToCart.getProductName());
		
	}

	

	private String readUserInput() {
		System.out.print("Product ID to add to cart or enter 'checkout' to proceed with checkout: ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		return userInput;
	}

	private void printProductsToConsole() {
		Product[] products = productManagementService.getProducts();
		for (Product product : products) {
			System.out.println(product);
		}
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** PRODUCT CATALOG *****");
		System.out.println("Enter product id to add it to the cart or 'menu' if you want to navigate back to the main menu");	
	}

}
