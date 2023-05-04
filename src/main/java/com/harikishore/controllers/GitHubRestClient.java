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
		Iterable<SystemTest> systemlist = systemRepository.findAll();
		return systemlist.toString();
    }
}