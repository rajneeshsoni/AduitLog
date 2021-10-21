package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.AuditDao;
import com.model.AuditLog;
import com.model.AuditLogSave;



@Service
public class AduitService {
	
	@Autowired
	AuditDao auditdao;
	
	public ResponseEntity<String> addAduitLog(AuditLog user)
	{
		AuditLogSave saveAudit = copyBean(user);
		
			auditdao.save(saveAudit);
			return new ResponseEntity<String>("Created ", HttpStatus.CREATED);
			
	}

	
	private AuditLogSave copyBean(AuditLog converterObject) {
		AuditLogSave auditDTO = new AuditLogSave();
		auditDTO.setDate(converterObject.getDate());
		auditDTO.setInfo(converterObject.getInfo());
		auditDTO.setOperation(converterObject.getOperation());
		auditDTO.setService(converterObject.getService());
		return auditDTO;
	}

}
