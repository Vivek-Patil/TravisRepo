import org.junit.Test;

import static org.junit.Assert.assertTrue;


//Job : Tests Area And Perimeter Of A Square
public class SquareTest {

	@Test
	public void returnCorrectAreaGivenSideOfASquare() throws Exception {
		Rectangle square_2 = Rectangle.createSquare(2);
		Rectangle square_5Point5 = Rectangle.createSquare(5.5);
		assertTrue(square_2.calculateArea() == (4.0));
		assertTrue(square_5Point5.calculateArea() == (30.25));
	}
}
