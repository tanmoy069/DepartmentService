package com.tanmoy.departmentservice.service;

import org.springframework.stereotype.Service;

import com.tanmoy.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private DepartmentRepository deptRepo;
	
	public DepartmentService(DepartmentRepository deptRepo) {
		this.deptRepo = deptRepo;
	}

}
