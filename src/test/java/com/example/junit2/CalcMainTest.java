package com.example.junit2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.intThat;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import com.example.junit.CalcMain;

class CalcMainTest {

	@Test
	public void testCalc2() throws Throwable {
		
		CalcMain target = new CalcMain();
		
		
		
		Method method = CalcMain.class.getDeclaredMethod(
				"calc", new Class<?>[] {int.class,int.class,int.class});
		
		method.setAccessible(true);
		
		int op = 1;
		int valL = 5;
		int valR = 3;
		
		int result= (int)method.invoke(target, new Object[] {op,valL,valR});
		
		assertEquals(8, result);
	}

}
