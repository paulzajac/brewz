package org.zajac.brewz.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class IngredientTypeTest {

	@Test
	public void test() 
	{
		assertEquals(5, IngredientType.values().length);
		assertEquals("HOPS", IngredientType.HOPS.name());
	}

}
