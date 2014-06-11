package org.zajac.brewz.model;

/**
 * A Supplier is the class that manages the information associated with the 
 * Supplier of some product to the Brewery.  
 * 
 * Supplier Names must be unique.
 * @author dad
 *
 */
public class Supplier {
	
	//
	// ATTRIBUTES
	//
	
	// The name of the supplier
	private String name;
	
	//
	// CONSTRUCTORS
	// 
	
	/**
	 * Default Constructor
	 */
	public Supplier(){}

	/**
	 * Parameter Constructor - used for testing
	 * @param name
	 */
	public Supplier(String name) {
		this.name = name;
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
}
