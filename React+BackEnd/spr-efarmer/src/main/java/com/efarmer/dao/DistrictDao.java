package com.efarmer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efarmer.model.CropStatus;
import com.efarmer.model.District;


@Repository
public interface DistrictDao extends CrudRepository<District, Integer>,JpaRepository<District, Integer>
{
	@Query(value = "SELECT * FROM crop_status WHERE farmer_id= :id  AND status NOT LIKE :a", nativeQuery = true)
	List<CropStatus> getAllCrops(@Param(value="id") int id,@Param(value="a") String a);
}
