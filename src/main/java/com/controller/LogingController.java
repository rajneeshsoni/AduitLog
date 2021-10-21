package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.AuditLog;
import com.service.AduitService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path="/logging")
public class LogingController {
	
	private static Logger log = LoggerFactory.getLogger(LogingController.class);
	
	@Autowired
	AduitService aduitLog;
	
	@RequestMapping(value = "/addLog", method = RequestMethod.POST)
	public ResponseEntity<String> addLogger(@RequestBody AuditLog logs )
	{
		log.info("logs"+logs.getInfo());
		//return aduitLog.addAduitLog(logs);
		return null;
	}

}
