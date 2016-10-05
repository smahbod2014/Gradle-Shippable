
package com.koda.gradletutorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {

	@Test
	public void testAdd() {
		assertEquals(8, Runner.add(5, 3));
	}

	@Test
	public void testAreaOfTriangle() {
		assertEquals(25.0, Runner.areaOfTriangle(10.0, 5.0), 0.00001);
	}
}
