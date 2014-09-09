import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProbabilityTest {

	private Probability probability_PointThree;
	private Probability probability_PointThreeOther;
	private Probability probability_PointFive;
	private Probability probability_One;
	private Probability probability_Zero;

	@Before
	public void setUp() {
		probability_PointThree = new Probability(0.3);
		probability_PointThreeOther = new Probability(0.3);
		probability_PointFive = new Probability(0.5);
		probability_One = new Probability(1);
		probability_Zero = new Probability(0);
	}

	@Test
	public void checkEqualityForTwoProbabilityObjects() {
		assertTrue((probability_PointThree.equals(probability_PointThreeOther)));
		assertFalse((probability_PointThree.equals(probability_PointFive)));
	}

	@Test
	public void checkEqualityForTwoDifferentTypeObjects() throws Exception {
		assertFalse(probability_PointFive.equals(new Rectangle(4, 5)));
	}

	@Test
	public void checkEqualityOfObjectWithNull() {
		assertFalse(probability_PointThree.equals(null));
	}

	@Test
	public void checkEqualityForObjectWithItself() {
		assertTrue(probability_PointThree.equals(probability_PointThree));
	}

	@Test
	public void checkProbabilityForNegationOfAnEvent() {
		assertTrue(probability_PointFive.negation().equals(new Probability(0.5)));
	}

	@Test
	public void checkProbabilityForAndOfTwoEvents() {

		assertTrue(probability_One.and(probability_One).equals(probability_One));
		assertTrue(probability_Zero.and(probability_One).equals(probability_Zero));
		assertTrue(probability_PointFive.and(probability_PointFive).equals(new Probability(0.25)));
	}

	@Test
	public void checkProbabilityForOrOfTwoEvents() {
		assertTrue(probability_One.or(probability_One).equals(probability_One));
		assertTrue(probability_Zero.or(probability_One).equals(probability_One));
		assertTrue(probability_PointFive.or(probability_PointFive).equals(new Probability(0.75)));
	}

}
