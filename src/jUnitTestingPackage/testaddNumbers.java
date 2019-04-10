package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	public void test() {
		jUnitFunction junit= new jUnitFunction();
		int result = junit.addNumbers(400,100);
		assertEquals(500,result);
		
		
	}

}
