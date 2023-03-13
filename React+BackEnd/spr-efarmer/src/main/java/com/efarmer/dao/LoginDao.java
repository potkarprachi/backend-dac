package com.efarmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efarmer.model.Login;


@Repository
public interface LoginDao extends CrudRepository<Login,Integer>,JpaRepository<Login,Integer>
{
	@Query(value="SELECT * FROM login WHERE email= :email", nativeQuery=true)
//	@Query(value="SELECT  FROM login l WHERE l.farmer_name= :name AND l.farmer_password=:password", nativeQuery=true)
	Login checkUser(@Param(value="email") String name);
	
	@Query(value="SELECT * FROM login WHERE id=:id",nativeQuery=true)
	Login getInfo(@Param(value="id") int ID);
}
