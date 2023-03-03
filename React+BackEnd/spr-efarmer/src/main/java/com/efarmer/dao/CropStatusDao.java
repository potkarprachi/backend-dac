package com.efarmer.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efarmer.model.CropStatus;

@Repository
public interface CropStatusDao extends JpaRepository<CropStatus, Integer>, CrudRepository<CropStatus, Integer>
{
	@Query(value = "SELECT * FROM crop_status WHERE farmer_id= :id  AND status NOT LIKE :a", nativeQuery = true)
	List<CropStatus> getAllCrops(@Param(value="id") int id,@Param(value="a") String a);
	
	@Query(value = "SELECT * FROM crop_status WHERE status LIKE :a", nativeQuery = true)
	List<CropStatus> getAllCrop(@Param(value="a") String a);

	
	@Transactional
	@Modifying
	@Query(value = "UPDATE crop_status SET status=:q WHERE cropid=:id", nativeQuery = true)
	Integer changeStatus(@Param(value="id") int id,@Param(value="q") String q);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE crop_status SET status=:q WHERE cropid=:id", nativeQuery = true)
	Integer updateStatus(@Param(value="id") int id,@Param(value="q") String q);
	
}
