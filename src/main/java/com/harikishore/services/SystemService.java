package com.harikishore.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harikishore.dao.SystemRepository;
import com.harikishore.model.SystemTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class SystemService {

    @Autowired
    SystemRepository systemRepository;

    /**
     *  Insert data into the table
     * @param id
     * @param name
     */
    public void insertData(long id, String name) {
        systemRepository.insertData(id, name);
    }

    /**
     * getData” method is used to get the data from the table “SystemTest” based on the id.
     * @param id
     * @return
     */
    public String getData(long id) {
        return systemRepository.getData(id).toString();
    }

    public String getAllData(){
        List<SystemTest> systemlist = systemRepository.findAll();
        String json =  "[]";
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            json = objectMapper.writeValueAsString(systemlist);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return json;
    }

}
