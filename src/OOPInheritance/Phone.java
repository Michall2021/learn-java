package OOPInheritance;

import java.math.BigDecimal;

import typesOfClasses.Product;

public class Phone extends Product{
	// Default constructor
		public Phone() {
			super("Nokia");
			System.out.println("Some code");
		}
		
		public void ring() {
			System.out.println("Ring!");
		}
		
		@Override
		public Product[] listVariants() {
			throw new UnsupportedOperationException();
		}
		
		public int calculateAmountOfVariants() {
			return listVariants().length;
		}

		@Override
		public boolean isAvailableInStock() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public BigDecimal getPrice() {
			// TODO Auto-generated method stub
			return null;
		}
}
