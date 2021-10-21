package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.AuditLogSave;



public interface AuditRepository extends JpaRepository<AuditLogSave , String> {

}
