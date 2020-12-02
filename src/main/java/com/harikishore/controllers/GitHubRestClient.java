package com.harikishore.controllers;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harikishore.dao.SystemRepository;
import com.harikishore.model.SystemTest;

@Service
public class GitHubRestClient {

    @Autowired
    DataSource dataSource;

    @Autowired
    SystemRepository systemRepository;

	 

	public String getPRConentURL() {
		String jsonResponse="NO_ReSPONE";
        /*try {
        	Client client = ClientBuilder.newClient();
        	 jsonResponse = client
        			.target("https://github.paypal.com/api/v3/repos/harik2/myTestpro")
        			.request(MediaType.APPLICATION_JSON)
        			.header("authorization", "token ebf5fcb50c51e7ca14a33a6c1e341224bcaad72c").get(String.class);
        	System.out.println(jsonResponse.toString());
        
        } catch (Exception ex) {
        	ex.printStackTrace();
        }*/
		Iterable<SystemTest> systemlist = systemRepository.findAll();
        System.out.println("here are system count: " + systemlist.toString());
		return systemlist.toString();
			}
}