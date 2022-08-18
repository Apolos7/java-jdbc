package application;

import java.util.List;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department department = new Department(1, null);
		List<Seller> sellersList = sellerDao.findByDepartment(department);
		
		sellersList.forEach(System.out::println);
		
		System.out.println("\n==== TEST 3: seller findAll ====");
		sellersList = sellerDao.findAll();
		
		sellersList.forEach(System.out::println);

	}

}
