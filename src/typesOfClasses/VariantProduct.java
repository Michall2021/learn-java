package typesOfClasses;

public class VariantProduct {
	private MasterProduct[] variants;

	public boolean isAvailableInStock() {
		for (MasterProduct masterProduct : variants) {
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}
}
