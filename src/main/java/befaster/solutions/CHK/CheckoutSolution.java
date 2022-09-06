package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
	
	private static Map<String, Integer> skus = new HashMap<String, Integer>();	
	
	static {	
		
		skus.put("A", 50);
		skus.put("B", 30);
		skus.put("C", 20);
		skus.put("D", 15);		
	}
	
    public Integer checkout(String itemsTobeCheckout) {
    	
    	String items [] =  itemsTobeCheckout.split(",");
    	Integer howManyItemA = 0;
    	Integer howManyItemB = 0;
    	
    	Integer sumItemsA = 0;
    	Integer sumItemsB = 0;
    	Integer otherItems = 0;
    	
    	
    	for(int i = 0 ; i < items.length; i ++) {
    		
    		if(items[i].equals("A")) {
    			
    			howManyItemA += 1;
    			sumItemsA += skus.get(items[i]);
    			
    		} else if(items[i].equals("B")) {
    			
    			howManyItemB += 1;
    			sumItemsB += skus.get(items[i]);
    			
    		} else {
    			otherItems += skus.get(items[i]);
    		}
    		
    	}
    	
    	if(howManyItemA == 3) {    		
    		sumItemsA = 130;
    	}
    	
     	if(howManyItemB == 2) {    		
    		sumItemsB = 45;
    	}
    	
        return sumItemsA + sumItemsB + otherItems;
    }
}



