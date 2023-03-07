package com.efarmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.efarmer.dao.TransactionDao;
import com.efarmer.model.Transaction;
@Service
public class TransactionServiceImpl implements TransactionService
{
	@Autowired
	private TransactionDao trans;

	@Override
	public void insert(Transaction t)
	{
		trans.save(t);
	}

	@Override
	public List<Transaction> fetchAll() 
	{
		return trans.findAll();
	}

	@Override
	public List<Transaction> fetchById(int id) 
	{
		return trans.findById(id);
	}
	
	@Override
	public List<Transaction> fetchByIdCust(int id) 
	{
		return trans.findByIdCustomer(id);
	}
}
