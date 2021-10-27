package com.tanmoy.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmoy.departmentservice.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
	Department findById(int id);

}
