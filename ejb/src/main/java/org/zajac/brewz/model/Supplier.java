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
	private String name;
	public Supplier(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
