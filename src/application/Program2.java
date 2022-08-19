package application;

import java.util.Scanner;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST1: insert department =====");
		Department department = new Department(null, "Library");
		departmentDao.insert(department);
		System.out.println("Insert completed!");
		
		System.out.println("===== TEST2: update department =====");
		department = new Department(6, "Teaching Management");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("===== TEST3: findById =====");
		department = departmentDao.findById(2);
		System.out.println("Department found: " + department);
		
		
		System.out.println("===== TEST4: findAll =====");
		List<Department> list = departmentDao.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("===== TEST5: delete department =====");
		System.out.println("Enter id for delete test");
		int id = input.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted!");
		
		input.close();
	}

}
