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
	public void testTotalItens_NoDiscount_AB() {
		
		Integer actual = checkOutSolution.checkout("A,B");
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
		
		Integer actual = checkOutSolution.checkout("A,B,C,D");
		Integer expected = 115;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA() {
		
		Integer actual = checkOutSolution.checkout("A,A,A");
		Integer expected = 130;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountB() {
		
		Integer actual = checkOutSolution.checkout("B,B");
		Integer expected = 45;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_Plus() {
		
		Integer actual = checkOutSolution.checkout("A,A,A,B");
		Integer expected = 160;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_DiscountB() {
		
		Integer actual = checkOutSolution.checkout("A,A,A,B,B");
		Integer expected = 175;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_DiscountA_DiscountB_Plus() {
		
		Integer actual = checkOutSolution.checkout("A,A,A,B,B,C,D");
		Integer expected = 210;
		assertEquals(expected, actual);		
		
	}


}

