package com.ltts.movie.model;

import java.sql.Date;

public class Production {
	private int productionId;
    private String productionName;
    private String Address;
    private Date dateOfStart;
    private String ownerName;
    
	

	public Production() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Production(int productionId, String productionName, String address, Date dateOfStart, String ownerName) {
		super();
		this.productionId = productionId;
		this.productionName = productionName;
		this.Address = address;
		this.dateOfStart = dateOfStart;
		this.ownerName = ownerName;
	}



	@Override
	public String toString() {
		return "Production [productionId=" + productionId + ", productionName=" + productionName + ", Address="
				+ Address + ", dateOfStart=" + dateOfStart + ", ownerName=" + ownerName + "]";
	}

	public int getProductionId() {
		return productionId;
	}

	public void setProductionId(int productionId) {
		this.productionId = productionId;
	}

	public String getProductionName() {
		return productionName;
	}

	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDateOfStart() {
		return dateOfStart;
	}

	public void setDateOfStart(Date dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
