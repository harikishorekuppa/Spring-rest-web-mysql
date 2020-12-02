package com.harikishore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicMergeController {

	
	@Autowired
	GitHubRestClient gitHubRestClient;

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String getComponentInfo() {
		
		
		return gitHubRestClient.getPRConentURL();

	}
}
