package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
	
	//TODO:Change this for a proper Enum
	private static final int PRICE_DISCOUNT_B = 45;
	private static final int PRICE_DISCOUNT_A = 130;
	private static final int DISCOUNT_B_HOW_MANY = 2;
	private static final int DISCOUNT_A_HOW_MANY = 3;
	
	private static Map<String, Integer> skus = new HashMap<String, Integer>();	
	
	static {	
		
		skus.put("A", 50);
		skus.put("B", 30);
		skus.put("C", 20);
		skus.put("D", 15);		
	}
	
    public Integer checkout(String itemsTobeCheckout) {
    	
    	String items [] =  itemsTobeCheckout.split("");
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
    			
    			if(items[i].equals("")) {
    				return 0;
    			}else if (Objects.isNull(skus.get(items[i]))) {
    				return -1;     			
    			}
    			
    			otherItems += skus.get(items[i]);
    		}
    		
    	}
    	
    	sumItemsA = checkSumItemsA(howManyItemA, sumItemsA);
    	
    	sumItemsB = checkSumItemsB(howManyItemB, sumItemsB);
    	
        return sumItemsA + sumItemsB + otherItems;
    }

	private Integer checkSumItemsB(Integer howManyItemB, Integer sumItemsB) {
		if(howManyItemB > DISCOUNT_B_HOW_MANY && howManyItemB % DISCOUNT_B_HOW_MANY == 0) {
    		sumItemsB = ((howManyItemB / DISCOUNT_B_HOW_MANY )* PRICE_DISCOUNT_B);
    	}    	
    	else if(howManyItemB >= DISCOUNT_B_HOW_MANY) {    		
    		sumItemsB = PRICE_DISCOUNT_B + ((howManyItemB - DISCOUNT_B_HOW_MANY )* skus.get("B"));
    	}
		return sumItemsB;
	}

	private Integer checkSumItemsA(Integer howManyItemA, Integer sumItemsA) {
		if(howManyItemA > DISCOUNT_A_HOW_MANY && howManyItemA % DISCOUNT_A_HOW_MANY == 0 ) {    		
    		sumItemsA = ((howManyItemA / DISCOUNT_A_HOW_MANY )* PRICE_DISCOUNT_A);
    	}else if (howManyItemA >= DISCOUNT_A_HOW_MANY) {
    		sumItemsA = PRICE_DISCOUNT_A + ((howManyItemA - DISCOUNT_A_HOW_MANY )* skus.get("A"));
    	}
		return sumItemsA;
	}
}








