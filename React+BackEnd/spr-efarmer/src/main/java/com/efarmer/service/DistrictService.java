package com.efarmer.service;

import java.util.List;

import com.efarmer.model.District;

public interface DistrictService 
{
	void insertDistrict(District district);
	List<District> getDistricts();
}
