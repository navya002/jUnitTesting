package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStrings {

	@Test
	void test() {
		jUnitFunction junitString = new jUnitFunction();
	    String result = junitString.addString("capstone","project");
	    assertEquals("capstoneproject",result);
	    
	}

}
