package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;



class CalcMainParameterRunnerTest {
	@ParameterizedTest
	@MethodSource("testCalc_Parameters")
	public void testCalc(int op, int valL, int valR,int expected) {
		CalcMain underTest = new CalcMain();
		
		int result= underTest.calc(op, valL, valR);
		
		assertEquals(expected, result);
	}
	
	@SuppressWarnings("unused")
	private static Object[][] testCalc_Parameters() throws Throwable {
		return new Object[][] {
			{1,5,3,8},
			{2,9,5,4},
			{3,7,6,42}
		};
	}

}
