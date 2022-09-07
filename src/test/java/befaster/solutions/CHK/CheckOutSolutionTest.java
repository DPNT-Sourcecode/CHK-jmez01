package befaster.solutions.CHK;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckOutSolutionTest {
	
	private CheckoutSolution checkOutSolution;

	@Before
	public void setUp() throws Exception {
		
		checkOutSolution = new CheckoutSolution();
	}
	
	@Test
	public void testTotalItens_Ilegal() {
		
		Integer actual = checkOutSolution.checkout("E");
		Integer expected = -1;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_Empty_String() {
		
		Integer actual = checkOutSolution.checkout("");
		Integer expected = 0;
		assertEquals(expected, actual);		
		
	}

	@Test
	public void testTotalItens_NoDiscount_AB() {
		
		Integer actual = checkOutSolution.checkout("AB");
		Integer expected = 80;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_NoDiscount_B() {
		
		Integer actual = checkOutSolution.checkout("B");
		Integer expected = 30;
		assertEquals(expected, actual);		
		
	}		
	
	@Test
	public void testTotalItens_NoDiscount_All() {
		
		Integer actual = checkOutSolution.checkout("ABCD");
		Integer expected = 115;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA() {
		
		Integer actual = checkOutSolution.checkout("AAA");
		Integer expected = 130;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountAAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAA");
		Integer expected = 180;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountAAAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAAA");
		Integer expected = 230;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountB() {
		
		Integer actual = checkOutSolution.checkout("BB");
		Integer expected = 45;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_Plus() {
		
		Integer actual = checkOutSolution.checkout("AAAB");
		Integer expected = 160;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_DiscountB() {
		
		Integer actual = checkOutSolution.checkout("AAABB");
		Integer expected = 175;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_DiscountB_Plus() {
		
		Integer actual = checkOutSolution.checkout("AAABBCD");
		Integer expected = 210;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_DiscountB_AAAAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAAAA");
		Integer expected = 260;
		assertEquals(expected, actual);				
	}
	
	@Test
	public void testTotalItens_DiscountA_DiscountB_BBB() {
		
		Integer actual = checkOutSolution.checkout("BBB");
		Integer expected = 75;
		assertEquals(expected, actual);				
	}
	
	
	/*
	 - {"method":"checkout","params":["AAAAAA"],"id":"CHK_R1_017"}, expected: 260, got: 280
	 - {"method":"checkout","params":["BBB"],"id":"CHK_R1_020"}, expected: 75, got: 90
	 - {"method":"checkout","params":["BBBB"],"id":"CHK_R1_021"}, expected: 90, got: 120*/
	
	
	


}




