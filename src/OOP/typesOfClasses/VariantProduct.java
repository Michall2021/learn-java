package typesOfClasses;

import java.math.BigDecimal;

public class VariantProduct extends Product{
	private MasterProduct[] variants;

	@Override
	public boolean isAvailableInStock() {
		for (MasterProduct masterProduct : variants) {
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
}
