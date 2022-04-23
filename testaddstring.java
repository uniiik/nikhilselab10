package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addString("100", "200");
		assertEquals("100200", result);
	}

}
