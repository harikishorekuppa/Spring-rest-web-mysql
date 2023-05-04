package com.harikishore.controllers;

import com.harikishore.services.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicMergeController {

	@Autowired
	GitHubRestClient gitHubRestClient;

	@Autowired
	SystemService systemService;

	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	public String getData() {
		return systemService.getAllData();
	}

	@RequestMapping(value = "/postdata/{id}/{name}", method = RequestMethod.POST)
	public String postData(@PathVariable("id") long id, @PathVariable("name") String name) {
		systemService.insertData(id, name);
		return "Data Inserted";
	}

	// wirte a method to use getData with id
	@RequestMapping(value = "/getdata/{id}", method = RequestMethod.GET)
	public String getData(@PathVariable("id") long id) {
		return systemService.getData(id);
	}

}
