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
	public void testTotalItens_NoDiscount() {
		
		Integer actual = checkOutSolution.checkout("A,B");
		Integer expected = 80;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_Discount() {
		
		Integer actual = checkOutSolution.checkout("A,A,A");
		Integer expected = 130;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_Discount() {
		
		Integer actual = checkOutSolution.checkout("B,B");
		Integer expected = 130;
		assertEquals(expected, actual);		
		
	}

}


