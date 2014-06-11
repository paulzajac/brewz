package org.zajac.brewz.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class IngredientTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testIsUsable() 
	{
		// Use the default constructor and a bunch of sets.
		Ingredient ingredient = new Ingredient();
		ingredient.setCategory(IngredientType.ADJUNCT);
		ingredient.setDeliveryUnit(DeliveryUnitType.BOX);
		ingredient.setMassPerDeliveryUnit((float) 10.0);
		ingredient.setMassUnitType(MassUnitType.LB);
		ingredient.setName("Test Ingredient");
		ingredient.setPricePerDeliveryUnit((float) 100.0);
		Supplier supplier = new Supplier();
		supplier.setName("Test Supplier");
		ingredient.setSupplier(supplier);
		
		// Make sure isUsable works
		assertTrue(ingredient.isUsable());
		
		// Test isUsable when using the parameter constructor
		Ingredient ing2 = new Ingredient("Test 2", new Supplier ("Supplier 2"), DeliveryUnitType.BAG, 
				MassUnitType.KG, (float) 20.0, (float) 15.0,	IngredientType.GRAIN);
		
		assertTrue(ing2.isUsable());
		
		// Make sure the parameter constructor assigns everything correctly.
		assertEquals("Test 2", ing2.getName());
		assertNotNull(ing2.getSupplier());
		Supplier ing2Supplier = ing2.getSupplier();
		assertEquals("Supplier 2", ing2Supplier.getName());
		
		assertEquals(DeliveryUnitType.BAG, ing2.getDeliveryUnit());
		assertEquals(MassUnitType.KG, ing2.getMassUnitType());
		assertEquals((float) 20.0, ing2.getPricePerDeliveryUnit(), 0.0001);
		assertEquals((float) 15.0, ing2.getMassPerDeliveryUnit(), 0.0001);
		assertEquals(IngredientType.GRAIN, ing2.getCategory());
		
		// Make sure that isUSable works on each case.
		// TODO Finish me.
	}

}
