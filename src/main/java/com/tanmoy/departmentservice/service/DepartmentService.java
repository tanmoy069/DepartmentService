package com.tanmoy.departmentservice.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.tanmoy.departmentservice.domain.Department;
import com.tanmoy.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private DepartmentRepository deptRepo;
	
	public DepartmentService(DepartmentRepository deptRepo) {
		this.deptRepo = deptRepo;
	}
	
	public Department findDepartmentById(int id) {
		return deptRepo.findById(id);
	}
	
	public boolean saveDepartment(@Valid Department dept) {
		try {
			if (findDepartmentById(dept.getId()) == null) {
				deptRepo.save(dept);
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean updateDepartment(@Valid Department dept) {
		try {
			if (findDepartmentById(dept.getId()) != null) {
				deptRepo.save(dept);
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
