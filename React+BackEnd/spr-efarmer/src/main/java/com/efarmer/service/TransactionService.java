package com.efarmer.service;
import java.util.List;

import com.efarmer.model.Transaction;
public interface TransactionService 
{
	void insert(Transaction t);
	List<Transaction> fetchAll();
	List<Transaction> fetchById(int id);
	List<Transaction> fetchByIdCust(int id);
}
