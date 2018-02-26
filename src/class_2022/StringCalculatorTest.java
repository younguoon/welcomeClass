package class_2022;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {


	// 콤마와 숫자로 구서오딘 문자열을 입력 받아, 콤마를 기준으로 분리한 숫자들의 합을 구하라
	// 숫자가 하나인 경우 해당 숫자를 반환
	@Test
	public void testStringCalculator() {
		// int add(String numbers)
		assertEquals(0    , StringCalculator.add("0"));
		assertEquals(2    , StringCalculator.add("2"));
		assertEquals(2+3  , StringCalculator.add("2,3"));
		assertEquals(2+3+6, StringCalculator.add("2,3,6"));
	}
	
	// 빈 문자열이거나 공백이 들어간 경우 0을 반환
	@Test
	public void test_빈문자열은_0을_반환(){
		assertEquals(0, StringCalculator.add(""));
		assertEquals(0, StringCalculator.add(" "));   // space
		assertEquals(0, StringCalculator.add("	"));  // tab
	}
	
	// 구분 문자로 개행 문자(\n)도 허용
	@Test
	public void test_구분문자로_개행문자도_허용(){
		assertEquals(2+3, StringCalculator.add("2\n3"));
		assertEquals(2+3+6, StringCalculator.add("2\n3,6"));
		
	}
	
}


