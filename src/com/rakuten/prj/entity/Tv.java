/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author pranav
 *
 */
public class Tv extends Product {
	private String screentype;

	/**
	 * 
	 */
	public Tv() {
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param screentype
	 */
	public Tv(int id, String name, double price, String screentype) {
		super(id, name, price);
		this.screentype = screentype;
	}

	/**
	 * @return the screentype
	 */
	public String getScreentype() {
		return screentype;
	}

	/**
	 * @param screentype the screentype to set
	 */
	public void setScreentype(String screentype) {
		this.screentype = screentype;
	}

	@Override
	public boolean isExpensive() {
		
		return false;
	}
	
}
