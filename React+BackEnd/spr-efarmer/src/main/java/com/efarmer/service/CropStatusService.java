package com.efarmer.service;

import java.util.List;

import com.efarmer.model.CropStatus;

public interface CropStatusService
{
	void insertCrop(CropStatus crop);
	List<CropStatus> getAllCropsById(int farmerID);
	Integer cancelCS(int id,String status);
}
