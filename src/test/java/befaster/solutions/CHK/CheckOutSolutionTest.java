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
	public void testTotalItensNoDiscount() {
		
		Integer actual = checkOutSolution.checkout("");
		Integer expected = 2;
		assertEquals(actual, expected);		
		
	}

}

