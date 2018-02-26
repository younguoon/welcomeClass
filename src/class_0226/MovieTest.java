package class_0226;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {

	private Movie movie;
	
	@Before
	public void setUp(){
		movie = new Movie();
	}
	
	@Test
	public void test_생성했을때_평균등급으로_0을_리턴() {
		assertEquals(0, movie.averageRate());
	}
	
	@Test
	public void test_등급으로_1을줬을때_평균등급으로_1을_리턴(){
		movie.rate(1);
		assertEquals(1, movie.averageRate());
	}
	
	@Test
	public void test_등급으로_3_5를_줬을때_평균등급으로_4를_반환(){
		movie.rate(3);
		movie.rate(5);
		assertEquals(4, movie.averageRate());
	}
}

