package com.efarmer.cntr;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efarmer.model.Transaction;
import com.efarmer.service.CropStatusService;
import com.efarmer.service.TransactionService;

@RestController
@CrossOrigin(value = {"http://localhost:3000"})
public class TransactionController 
{
	@Autowired
	private TransactionService trans;
	@Autowired
	private CropStatusService cs;
	
	@PostMapping(value = {"/addTransaction"})
	public String addTransaction(@RequestBody Transaction tr)
	{
		cs.updateCustomer(tr.getCropID(),tr.getCustomerid());
		trans.insert(tr);
		return "success";
	}
	
	
	@GetMapping(value = {"/getAllTransaction"})
	public List<Transaction> getAll()
	{
		return trans.fetchAll();
	}
	
	@GetMapping(value = {"/getAllTransactionFarmer/{id}"})
	public List<Transaction> getAllId(@PathVariable("id") int id)
	{
		return trans.fetchById(id);
	}
	
	@GetMapping(value = {"/getAllTransactionCust/{id}"})
	public List<Transaction> getAllIdCust(@PathVariable("id") int id)
	{
		return trans.fetchByIdCust(id);
	}
}
