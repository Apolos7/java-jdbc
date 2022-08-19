package application;

import java.util.Scanner;

import mode.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST1: Insert department =====");
		Department department = new Department(null, "Library");
		departmentDao.insert(department);
		System.out.println("Insert completed!");
		
		System.out.println("===== TEST2: Update department =====");
		department = new Department(6, "Teaching Management");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("===== TEST3: Delete department =====");
		System.out.println("Enter id for delete test");
		int id = input.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted!");
		
		input.close();
	}

}
