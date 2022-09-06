package befaster.solutions.HLO;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {

	private HelloSolution helloSolution;

	@Before
	public void setUp() {

		helloSolution = new HelloSolution();
	}

	@Test
	public void test() {

		String actual = helloSolution.hello("Igor");
		String expected = "Hello, World!";
		assertEquals(actual, expected);

	}

}

