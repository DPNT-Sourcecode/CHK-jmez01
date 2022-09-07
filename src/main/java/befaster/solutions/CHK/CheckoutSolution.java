package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
	
	private static final int HOW_MANY_E_TO_TAKE_B = 2;
	//TODO:Change this for a proper Enum
	private static final int PRICE_DISCOUNT_B = 45;
	private static final int PRICE_DISCOUNT_A_3 = 130;
	private static final int PRICE_DISCOUNT_A_5 = 200;
	private static final int DISCOUNT_B_HOW_MANY = 2;
	private static final int DISCOUNT_A_3 = 3;
	private static final int DISCOUNT_A_5 = 5;
	
	private static Map<String, Integer> skus = new HashMap<String, Integer>();	
	
	static {	
		
		skus.put("A", 50);
		skus.put("B", 30);
		skus.put("C", 20);
		skus.put("D", 15);	
		skus.put("E", 40);	
	}
	
    public Integer checkout(String itemsTobeCheckout) {
    	
    	String items [] =  itemsTobeCheckout.split("");
    	
    	Arrays.sort(items);
    	
    	Integer howManyItemA = 0;
    	Integer howManyItemB = 0;
    	Integer howManyItemE = 0;    	
    	
    	Integer sumItemsA = 0;
    	Integer sumItemsB = 0;
      	Integer sumItemsE = 0;
    	Integer otherItems = 0;    	
    	
    	for(int i = 0 ; i < items.length; i ++) {
    		
    		if(items[i].equals("A")) {
    			
    			howManyItemA += 1;
    			sumItemsA += skus.get(items[i]);
    			
    		} else if(items[i].equals("B")) {
    			
    			howManyItemB += 1;
    			sumItemsB += skus.get(items[i]);
    			
    		}
    		else if(items[i].equals("E")) {
    			
    			howManyItemE += 1;
    			sumItemsE += skus.get(items[i]);    			
    		}
    		else {
    			
    			if(items[i].equals("")) {
    				return 0;
    			}else if (Objects.isNull(skus.get(items[i]))) {
    				return -1;     			
    			}
    			
    			otherItems += skus.get(items[i]);
    		}
    		
    	}
    	
    	sumItemsA = checkSumItemsA(howManyItemA, sumItemsA);    	   	
    	   	
    	sumItemsB = checkSumItemsB(howManyItemB, sumItemsB, howManyItemE);
    	
        return sumItemsA + sumItemsB + sumItemsE + otherItems;
    }

    

	private Integer checkSumItemsB(Integer howManyItemB, Integer sumItemsB,  Integer howManyItemE) {
		
		if(howManyItemE == HOW_MANY_E_TO_TAKE_B && howManyItemB > 0) {			 
			 howManyItemB -= 1;
			 sumItemsB -= skus.get("B");			 
		}
		
		if(howManyItemE > HOW_MANY_E_TO_TAKE_B && howManyItemB > 0) {			 
			 howManyItemB -= (howManyItemE /HOW_MANY_E_TO_TAKE_B);
			 sumItemsB -= (howManyItemE /HOW_MANY_E_TO_TAKE_B) * skus.get("B");			 
		}				
		
		if(howManyItemB >= DISCOUNT_B_HOW_MANY && howManyItemB % DISCOUNT_B_HOW_MANY == 0) {
    		sumItemsB = ((howManyItemB / DISCOUNT_B_HOW_MANY )* PRICE_DISCOUNT_B);
    	}    	
    	else if(howManyItemB % DISCOUNT_B_HOW_MANY != 0) { //When the number of items are not squared ex: BBB and there is discount   
    		int rest = howManyItemB % DISCOUNT_B_HOW_MANY;
    		sumItemsB = (rest * skus.get("B"))  + ((howManyItemB - rest) /DISCOUNT_B_HOW_MANY) * PRICE_DISCOUNT_B;
    	}
		
		return sumItemsB;
	}

	//TODO: Refactor this code 
	private Integer checkSumItemsA(Integer howManyItemA, Integer sumItemsA) {
		
		if(howManyItemA < DISCOUNT_A_5 && howManyItemA >= DISCOUNT_A_3 && howManyItemA % DISCOUNT_A_3 == 0 ) {    		
    		sumItemsA = ((howManyItemA / DISCOUNT_A_3 )* PRICE_DISCOUNT_A_3);
     	}else if (howManyItemA < DISCOUNT_A_5 && howManyItemA % DISCOUNT_A_3 != 0) {//When the number of items are not squared ex: AAAA and there is discount
    		int rest = howManyItemA % DISCOUNT_A_3;
    		sumItemsA = (rest * skus.get("A"))  + ((howManyItemA - rest) /DISCOUNT_A_3) * PRICE_DISCOUNT_A_3;
    	}else if(howManyItemA >= DISCOUNT_A_5 && howManyItemA % DISCOUNT_A_5 == 0) {
    		sumItemsA = ((howManyItemA / DISCOUNT_A_5 )* PRICE_DISCOUNT_A_5);
    	}else if(howManyItemA >= DISCOUNT_A_5 && howManyItemA % DISCOUNT_A_5 !=0) {//When the number of items are not squared ex: AAAAAAAA and there is discount
    		
    		int rest = howManyItemA % DISCOUNT_A_5;      		
    		
    		if(rest < DISCOUNT_A_3) {    			
    			sumItemsA = (rest * skus.get("A"))  + ((howManyItemA - rest) /DISCOUNT_A_5) * PRICE_DISCOUNT_A_5; //when we apply the discount on the first five items + items < 3, ex:AAAAAAA
    		}else if (rest >= DISCOUNT_A_3) {  //when we apply the discount on the first five items + items > 3, ex:AAAAAAAAA  			
    			sumItemsA = ((rest / DISCOUNT_A_3 )* PRICE_DISCOUNT_A_3) + (rest % DISCOUNT_A_3) * skus.get("A")  + ((howManyItemA - rest) /DISCOUNT_A_5) * PRICE_DISCOUNT_A_5;
    		}
    		
    	}
		
		return sumItemsA;
	}
}





