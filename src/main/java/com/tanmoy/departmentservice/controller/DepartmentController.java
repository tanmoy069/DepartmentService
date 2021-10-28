package com.tanmoy.departmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tanmoy.departmentservice.domain.Department;
import com.tanmoy.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private DepartmentService deptService;
	
	public DepartmentController(DepartmentService deptService) {
		this.deptService = deptService;
	}
	
	@GetMapping("/findby")
	public Department findDepartmentById(@RequestParam(name = "id", required = true) Integer id) {
		return deptService.findDepartmentById(id);
	}

}
