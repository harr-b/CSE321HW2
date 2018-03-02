import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTest {
	
	@Test
	public void testFindAverage() {
		SimpleProgram simple = new SimpleProgram();
		double[] testArray = new double[5];
		testArray[0] = 1;
		testArray[1] = 4;
		testArray[2] = 3;
		testArray[3] = 5;
		testArray[4] = 7;
		
		double testResult = simple.findAverage(testArray);
		
		assertEquals(4, testResult, 0.0001);
	}
}
