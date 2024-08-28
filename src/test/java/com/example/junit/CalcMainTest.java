package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.intThat;

import org.junit.jupiter.api.Test;

class CalcMainTest {

	@Test
	public void testCalc2() {
		
		CalcMain target = new CalcMain();
		
		int op = 2;
		int valL = 10;
		int valR = 4;
		
		int result = target.calc(op, valL, valR);
		
		assertEquals(6, result);
	}
	
	@Test
	public void testCalc() {
		
		CalcMain target = new CalcMain();
		
		int op = 1;
		int valL = 5;
		int valR = 3;
		
		int result = target.calc(op, valL, valR);
		
		assertEquals(8, result);
	}

}
