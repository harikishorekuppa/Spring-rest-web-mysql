package com.harikishore.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.harikishore.model.SystemTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface SystemRepository extends CrudRepository<SystemTest,Long> {

    // find if any runtime errors in the below inert query
    @Modifying
    @Transactional
    @Query(value = "insert into system_test(id, name) values (:id, :name)", nativeQuery = true)
     void insertData(@Param("id") long id, @Param("name") String name);


    /**  -- USING IDE
     * getData” method is used to get the data from the table “SystemTest” based on the id.
     * @param id
     * @return
     */
    @Query(value = "select * from SystemTest where id = :id", nativeQuery = true)
    SystemTest getData(@Param("id") long id);

    List<SystemTest> findAll();

}
