package com.tanmoy.departmentservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tanmoy.departmentservice.domain.Department;
import com.tanmoy.departmentservice.service.DepartmentService;

@SpringBootTest
class DepartmentServiceApplicationTests {

	@Autowired private DepartmentService deptService;
	
	@Test
	void testSaveDepartment() {
		Department dept = new Department("Department of ECE", true);
		boolean isTrue = deptService.saveDepartment(dept);
		System.out.println(isTrue);
		System.out.println(deptService.findDepartmentById(1));
	}
	
	@Test
	void testUpdateDepartment() {
//		Department dept = new Department("CSE", true);
		Department dept = deptService.findDepartmentById(1);
		System.out.println(dept.toString());
		dept.setName("Department of Computer Science");
		boolean isTrue = deptService.updateDepartment(dept);
		System.out.println(isTrue);
		System.out.println(deptService.findDepartmentById(1));
		
	}

}
