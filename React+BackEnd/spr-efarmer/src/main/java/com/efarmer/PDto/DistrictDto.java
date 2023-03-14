package com.efarmer.PDto;


public class DistrictDto 
{
   private	int districtId;
	private String district;
	
	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", district=" + district + "]";
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getDistrictId() {
		return districtId;
	}
	
	
	
}
