package com.tanmoy.departmentservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanmoy.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private DepartmentService deptService;
	
	public DepartmentController(DepartmentService deptService) {
		this.deptService = deptService;
	}

}
