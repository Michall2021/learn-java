package aplicationForOnlineStore;

import aplicationForOnlineStore.Product;


public interface ProductManagementService {

	Product[] getProducts();
	Product getProductById(int productIdAddToCart);
}
