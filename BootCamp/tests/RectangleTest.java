import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest {
	private Rectangle rectangle2By3;
	private Rectangle rectangle5By2;

	@Before
	public void setData() throws Exception {
		try {
			rectangle2By3 = new Rectangle(2, 3);
			rectangle5By2 = new Rectangle(5, 2);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
	}

	@Test
	public void returnCorrectAreaGivenLengthAndBreadth() {
		double actual2By3 = rectangle2By3.calculateArea();
		double actual5By2 = rectangle5By2.calculateArea();
		double expected2By3 = 6.0;
		double expected5By2 = 10.0;
		assertThat(actual2By3, is(expected2By3));
		assertThat(actual5By2, is(expected5By2));
	}

	@Test
	public void returnCorrectPerimeterGivenLengthAndBreadth() {
		double actual5By2 = rectangle5By2.calculatePerimeter();
		double actual2By3 = rectangle2By3.calculatePerimeter();
		double expected5By2 = 14.0;
		double expected2By3 = 10.0;
		assertThat(actual2By3, is(expected2By3));
		assertThat(actual5By2, is(expected5By2));
	}
}
