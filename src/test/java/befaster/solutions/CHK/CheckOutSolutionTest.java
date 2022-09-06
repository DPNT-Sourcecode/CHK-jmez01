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
	
//	id = CHK_R1_002, req = checkout(""), resp = -1 ok
//			id = CHK_R1_003, req = checkout("A"), resp = 50
//			id = CHK_R1_004, req = checkout("B"), resp = 30
//			id = CHK_R1_005, req = checkout("C"), resp = 20
//			id = CHK_R1_006, req = checkout("D"), resp = 15
//			id = CHK_R1_007, req = checkout("a"), resp = -1
//			id = CHK_R1_008, req = checkout("-"), resp = -1
//			id = CHK_R1_009, req = checkout("ABCa"), resp = -1
//			id = CHK_R1_010, req = checkout("AxA"), resp = -1
//			id = CHK_R1_011, req = checkout("ABCD"), resp = -1
//			id = CHK_R1_012, req = checkout("A"), resp = 50
//			id = CHK_R1_013, req = checkout("AA"), resp = -1
//			id = CHK_R1_014, req = checkout("AAA"), resp = -1
//			id = CHK_R1_015, req = checkout("AAAA"), resp = -1
//			id = CHK_R1_016, req = checkout("AAAAA"), resp = -1
//			id = CHK_R1_017, req = checkout("AAAAAA"), resp = -1
//			id = CHK_R1_018, req = checkout("B"), resp = 30
//			id = CHK_R1_019, req = checkout("BB"), resp = -1
//			id = CHK_R1_020, req = checkout("BBB"), resp = -1
//			id = CHK_R1_021, req = checkout("BBBB"), resp = -1
//			id = CHK_R1_022, req = checkout("ABCDABCD"), resp = -1
//			id = CHK_R1_023, req = checkout("BABDDCAC"), resp = -1
//			id = CHK_R1_024, req = checkout("AAABB"), resp = -1
//			id = CHK_R1_001, req = checkout("ABCDCBAABCABBAAA"), resp = -1
//	
	@Test
	public void testTotalItens_Ilegal() {
		
		Integer actual = checkOutSolution.checkout("");
		Integer expected = -1;
		assertEquals(expected, actual);		
		
	}
	
	@Test
	public void testTotalItens_NoDiscount_A() {
		
		Integer actual = checkOutSolution.checkout("A");
		Integer expected = 50;
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


