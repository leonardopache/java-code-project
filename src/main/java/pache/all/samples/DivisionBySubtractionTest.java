package pache.all.samples;
import org.junit.Assert;
import org.junit.Test;

public class DivisionBySubtractionTest {
	@Test
	public void divisionRecursivelyTest() {
		int quotient = DivisionBySubtraction.subtractionRecursively(25, 3);
		Assert.assertEquals(8, quotient);
	}
	@Test
	public void divisionInteractivelyTest() {
		int quotient = DivisionBySubtraction.subtractionInteractively(25, 3);
		Assert.assertEquals(8, quotient);
	}
}
