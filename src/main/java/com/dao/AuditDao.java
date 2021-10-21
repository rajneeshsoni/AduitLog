package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.AuditLogSave;
import com.repository.AuditRepository;



@Component
public class AuditDao {
	
	@Autowired
	public AuditRepository repo;
	
	public void save(AuditLogSave auditdata)
	{
		repo.save(auditdata);
	}

}
