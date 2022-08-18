package model.dao;

import java.util.List;

import mode.entities.Department;

public interface DepartmentDao {

	void insert(Department department);

	void update(Department department);

	void deleById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();

}