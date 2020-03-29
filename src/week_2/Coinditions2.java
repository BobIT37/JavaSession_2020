package week_2;

public class Coinditions2 {

	public static void main(String[] args) {
		
		/*
		 * Online store
		 * price, speed
		 * 
		 * Regular Shipping Rates
		 * Purchase Price      cost
		 * 1 - 100              17
		 * 101 - 300            10
		 * 300+                 free
		 * 
		 * Express Shipping
		 * Purchase Price       cost
		 * 1 - 100              35
		 * 101 - 300            25
		 * 300+                 15
		 * 
		 * 
		 */
		
		// Nested if === if == inside if statement we have another if statement
		
		int shippingMode = 2; // 2 for express
		double purchasePrice = 250;
		double shippingCost = 0.0;
		
		if (shippingMode == 1){
			System.out.println(" ----Regular Shipping-----");
			if(purchasePrice >=1.0 && purchasePrice <= 100.0){
				shippingCost = 17.0;
			}else if (purchasePrice > 100.0 && purchasePrice <= 300.0){
				shippingCost = 10.0;
			}else if( purchasePrice > 300.0){
				shippingCost = 0.0;
			}
		}else if (shippingMode == 2){
			System.out.println(" ----Express Shipping-----");
			if(purchasePrice >=1.0 && purchasePrice <= 100.0){
				shippingCost = 35.0;
			}else if (purchasePrice > 100.0 && purchasePrice <= 300.0){
				shippingCost = 25.0;
			}else if( purchasePrice > 300.0){
				shippingCost = 15.0;
			}
			
		}
		
       System.out.println("Total shpping cost: "+ shippingCost);
		

	}

}
