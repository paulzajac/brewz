package org.zajac.brewz.model;

/**
 * The Ingredient Class tracks all of the information for an ingredient that is 
 * used to make beer.
 * 
 * The combination of Ingredient.name and Ingredient.supplier.name must be unique
 * in the database.
 * 
 * An Ingredient is usable when all of its attributes are defined.
 * 
 * @author dad
 *
 */
public class Ingredient 
{
	// 
	// Class Attributes
	// 
	
	// The name of the ingredient.
	private String name;
	// The Supplier who provides the brewer with the supplies
	private Supplier supplier;
	// The way that the supplier supplies this ingredient (BOX, BAG etc)
	private DeliveryUnitType deliveryUnit;
	// The unit type of this ingredient that is ordered (LB / KG)
	private MassUnitType massUnitType;	
	// The price of this ingredient per delivery unit (in $)
	private float pricePerDeliveryUnit; 	
	// The quantity of unit type in mass units (50 LBS for example)
	private float massPerDeliveryUnit;	
	// The category of the Ingredient Type
	private IngredientType category;

	// 
	// Class Methods
	//
	
	//
	// CONSTRUCTORS
	// 
	
	/**
	 * Default Constructor
	 */
	public Ingredient(){}
	
	/**
	 * Parameter based Constructor - used for testing.
	 * @param name
	 * @param supplier
	 * @param deliveryUnit
	 * @param massUnitType
	 * @param pricePerDeliveryUnit
	 * @param massPerDeliveryUnit
	 * @param category
	 */
	public Ingredient(String name, Supplier supplier, DeliveryUnitType deliveryUnit, 
			MassUnitType massUnitType, float pricePerDeliveryUnit, float massPerDeliveryUnit,
			IngredientType category)
	{
		this.name = name;
		this.supplier = supplier;
		this.deliveryUnit = deliveryUnit;
		this.massUnitType = massUnitType;
		this.pricePerDeliveryUnit = pricePerDeliveryUnit;
		this.massPerDeliveryUnit = massPerDeliveryUnit;
		this.category = category;
	}
	
	//
	// OPERATIONS
	//
	
	/**
	 * This method returns true if all attributes of this class are populated, false otherwise.
	 * @return
	 */
	public boolean isUsable()
	{
		if (name != null &&
			supplier != null &&
			deliveryUnit != null &&
			massUnitType != null &&
			pricePerDeliveryUnit >= 0.0 &&
			massPerDeliveryUnit >= 0.0 &&
			category != null)
		{
			return true;
		}
		return false;
	}

	//
	// GETTERS AND SETTERS
	//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public DeliveryUnitType getDeliveryUnit() {
		return deliveryUnit;
	}

	public void setDeliveryUnit(DeliveryUnitType deliveryUnit) {
		this.deliveryUnit = deliveryUnit;
	}

	public MassUnitType getMassUnitType() {
		return massUnitType;
	}

	public void setMassUnitType(MassUnitType massUnitType) {
		this.massUnitType = massUnitType;
	}

	public float getPricePerDeliveryUnit() {
		return pricePerDeliveryUnit;
	}

	public void setPricePerDeliveryUnit(float pricePerDeliveryUnit) {
		this.pricePerDeliveryUnit = pricePerDeliveryUnit;
	}

	public float getMassPerDeliveryUnit() {
		return massPerDeliveryUnit;
	}

	public void setMassPerDeliveryUnit(float massPerDeliveryUnit) {
		this.massPerDeliveryUnit = massPerDeliveryUnit;
	}

	public IngredientType getCategory() {
		return category;
	}

	public void setCategory(IngredientType category) {
		this.category = category;
	}
	
}
