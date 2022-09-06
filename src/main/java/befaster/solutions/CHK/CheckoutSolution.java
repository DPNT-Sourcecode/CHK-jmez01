package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
	
	private static Map<String, Integer> skus = new HashMap<String, Integer>();	
	
	static {
		
	//	
//		+------+-------+----------------+
//		| Item | Price | Special offers |
//		+------+-------+----------------+
//		| A    | 50    | 3A for 130     |
//		| B    | 30    | 2B for 45      |
//		| C    | 20    |                |
//		| D    | 15    |                |
//		+------+-------+----------------+
		
		skus.put("A", 50);
		skus.put("B", 30);
		skus.put("A", 20);
		skus.put("A", 15);		
	}
	
    public Integer checkout(String itemsTobeCheckout) {
    	
    	String items [] =  itemsTobeCheckout.split(",");
    	
    	Integer sumItems = 0;
    	
    	for(int i = 0 ; i < items.length; i ++) {
    		
    		sumItems += skus.get(items[i]);
    		
    	}    	    	
    	
        return sumItems;
    }
}





