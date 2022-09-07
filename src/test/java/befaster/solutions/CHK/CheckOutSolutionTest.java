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
		
		Integer actual = checkOutSolution.checkout("a");
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
	public void testTotalItens_AB() {
		
		Integer actual = checkOutSolution.checkout("AB");
		Integer expected = 80;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_B() {
		
		Integer actual = checkOutSolution.checkout("B");
		Integer expected = 30;
		assertEquals(expected, actual);		
		
	}		
	
	@Test
	public void testTotalItens_ABCD() {
		
		Integer actual = checkOutSolution.checkout("ABCD");
		Integer expected = 115;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAA() {
		
		Integer actual = checkOutSolution.checkout("AAA");
		Integer expected = 130;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAA");
		Integer expected = 180;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAAA");
		Integer expected = 200;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_BB() {
		
		Integer actual = checkOutSolution.checkout("BB");
		Integer expected = 45;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAAB() {
		
		Integer actual = checkOutSolution.checkout("AAAB");
		Integer expected = 160;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAABB() {
		
		Integer actual = checkOutSolution.checkout("AAABB");
		Integer expected = 175;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAABBCD() {
		
		Integer actual = checkOutSolution.checkout("AAABBCD");
		Integer expected = 210;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_AAAAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAAAA");
		Integer expected = 250;
		assertEquals(expected, actual);				
	}
	
	@Test
	public void testTotalItens_BBB() {
		
		Integer actual = checkOutSolution.checkout("BBB");
		Integer expected = 75;
		assertEquals(expected, actual);				
	}
	
	@Test
	public void testTotalItens_BBBB() {
		
		Integer actual = checkOutSolution.checkout("BBBB");
		Integer expected = 90;
		assertEquals(expected, actual);				
	}		
	
	@Test
	public void testTotalItens_ABCDABCD() {
		
		Integer actual = checkOutSolution.checkout("ABCDABCD");
		Integer expected = 215;
		assertEquals(expected, actual);				
	}	
	
	@Test
	public void testTotalItens_AAAAAAA() {
		
		Integer actual = checkOutSolution.checkout("AAAAAAA");
		Integer expected = 300;
		assertEquals(expected, actual);				
	}	
	
	
	@Test
	public void testTotalItens_ABCDCBAABCABBAAA() {
		
		Integer actual = checkOutSolution.checkout("ABCDCBAABCABBAAA");
		Integer expected = 495;
		assertEquals(expected, actual);				
	}	
	
	@Test
	public void testTotalItens_E() {
		
		Integer actual = checkOutSolution.checkout("E");
		Integer expected = 40;
		assertEquals(expected, actual);				
	}	
	
	@Test
	public void testTotalItens_EE() {
		
		Integer actual = checkOutSolution.checkout("EE");
		Integer expected = 80;
		assertEquals(expected, actual);				
	}		
	
	@Test
	public void testTotalItens_EEB() {
		
		Integer actual = checkOutSolution.checkout("EEB");
		Integer expected = 80;
		assertEquals(expected, actual);				
	}	
	
	@Test
	public void testTotalItens_EEEB() {
		
		Integer actual = checkOutSolution.checkout("EEEB");
		Integer expected = 120;
		assertEquals(expected, actual);				
	}		

	@Test
	public void testTotalItens_EEEEBB() {		
		Integer actual = checkOutSolution.checkout("EEEEEEBBB");
		Integer expected = 240;
		assertEquals(expected, actual);				
	}
	

	@Test
	public void testTotalItens_ABCDEABCDE() {		
		Integer actual = checkOutSolution.checkout("ABCDEABCDE");
		Integer expected = 280;
		assertEquals(expected, actual);				
	}
	
	@Test
	public void testTotalItens_CCADDEEBBA() {		
		Integer actual = checkOutSolution.checkout("CCADDEEBBA");
		Integer expected = 280;
		assertEquals(expected, actual);				
	}	
	
	@Test
	public void testTotalItens_AAAAAEEBAAABB() {		
		Integer actual = checkOutSolution.checkout("AAAAAEEBAAABB");
		Integer expected = 485;
		assertEquals(expected, actual);				
	}
	
	
	/*id = CHK_R2_038, req = checkout("ABCDEABCDE"), resp = 280
			id = CHK_R2_039, req = checkout("CCADDEEBBA"), resp = 280
			id = CHK_R2_040, req = checkout("AAAAAEEBAAABB"), resp = 485
			id = CHK_R2_001, req = checkout("ABCDECBAABCABBAAAEEAA"), resp = 675*/
	
}




