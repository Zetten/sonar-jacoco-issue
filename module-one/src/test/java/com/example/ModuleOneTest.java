package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ModuleOneTest {

	@Test
	public void test() {
		new ModuleOne().doSomething();
		assertTrue(true);
	}

}
