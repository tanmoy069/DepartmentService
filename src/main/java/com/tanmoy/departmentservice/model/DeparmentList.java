package com.tanmoy.departmentservice.model;

import java.util.List;

import com.tanmoy.departmentservice.domain.Department;

public class DeparmentList {

	private List<Department> deptList;

	public DeparmentList() {
		super();
	}

	public DeparmentList(List<Department> deptList) {
		super();
		this.deptList = deptList;
	}

	public List<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}

}
