package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumber(100, 200);
		assertEquals(300, result);
	}

}
