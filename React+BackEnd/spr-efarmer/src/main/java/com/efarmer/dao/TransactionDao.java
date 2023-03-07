package com.efarmer.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efarmer.model.Transaction;

@Repository
public interface TransactionDao extends CrudRepository<Transaction, Integer>,JpaRepository<Transaction, Integer>
{
	@Query(value="SELECT * FROM transactions WHERE farmer_id=:id",nativeQuery=true)
	List<Transaction> findById(@Param(value="id") int id);
	
	@Query(value="SELECT * FROM transactions WHERE customer_id=:id",nativeQuery=true)
	List<Transaction> findByIdCustomer(@Param(value="id") int id);
}
