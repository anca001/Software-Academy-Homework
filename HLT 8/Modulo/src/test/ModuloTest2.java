package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.modulo.Modulo;


public class ModuloTest2 {

		@Test
		void testDivide() {
			int a = 11;
			int b = 4;
			
		Modulo obj = new Modulo(); 
		int actual_result = obj.divide(a, b); //a->11 b->4
		
		int expected_result = 3;
		
		assertEquals(expected_result, actual_result); //expected-actual ==0 
		}
		
		@Test
		void TestDivide1() {
			int a = 40;
			int b = 6;
			
		Modulo obj = new Modulo();
		int actual_result = obj.divide(a, b); //a-> 40 b-> 6
		
		int expected_result = 4;
		
		assertEquals(expected_result, actual_result); 
		}


}
