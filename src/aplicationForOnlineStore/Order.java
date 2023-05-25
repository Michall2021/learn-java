package aplicationForOnlineStore;

public interface Order {
	
	boolean isCreditCardNumberValid(String userInput);
	void setCreditCardNumber(String userInput);
	void setProducts(Product[] products);

	int getCustomerId();
	void setCustomerId(int id);

}
