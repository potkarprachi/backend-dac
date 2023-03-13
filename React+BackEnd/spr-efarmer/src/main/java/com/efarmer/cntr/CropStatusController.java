package com.efarmer.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efarmer.PDto.CropStatusDto;
import com.efarmer.model.CropStatus;
import com.efarmer.service.CropStatusService;

@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class CropStatusController 
{
	@Autowired
	private CropStatusService cropStatusService;
	
	@PostMapping(value= {"/addCrop/{id}"})
	public void insertCrop(@RequestBody CropStatus crop,@PathVariable("id") int farmerid)
	{
		cropStatusService.insertCrop(crop);
	}
	@GetMapping(value = {"/getAllCropList/{id}"})
	public List<CropStatus> getAllCropList(@PathVariable("id") int farmerid)
	{
		
		return cropStatusService.getAllCropsById(farmerid);
	}
	
	@PutMapping(value = {"/updateStatusCrop/{oid}"})
	public Integer canccelSell(@PathVariable("oid") int id)
	{
		return cropStatusService.cancelCS(id,"Cancelled");
	}

	@PutMapping(value = {"/updateStatusByAdmin/{oid}/{status}"})
	public Integer updateStatus(@PathVariable("oid") int id,@PathVariable("status") String status)
	{
		System.out.println(status);
		return cropStatusService.updateStatus(id,status);
	}
	
	@GetMapping(value = {"/getAllCrops"})
	public List<CropStatus> getAllCrops()
	{
		return cropStatusService.getAllCrops("Pending");
	}
	
	@GetMapping(value = {"/menuPage"})
	public List<CropStatus> getToSellCrops()
	{
		return cropStatusService.getAllCrops("Accepted");
	}
}
