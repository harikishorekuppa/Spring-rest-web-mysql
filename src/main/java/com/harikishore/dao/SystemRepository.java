package com.harikishore.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.harikishore.model.SystemTest;

@Repository
public interface SystemRepository extends CrudRepository<SystemTest,Long> {
	

}
