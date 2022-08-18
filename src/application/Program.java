package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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
		
		System.out.println("\n==== TEST 4: seller insert seller ====");
		Seller newSeller = new Seller(null, "Carlos", "Carlos@example.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n==== TEST 5: seller update seller ====");
		seller = sellerDao.findById(1);
		
		seller.setName("Martha Waine");
		
		sellerDao.update(seller);
		
		System.out.println("Updated! New information from the seller = " + seller);
		
		
		System.out.println("\n==== TEST 6: seller deleteById seller ====");
		System.out.println("Enter id for delete test: ");
		int id = input.nextInt();
		
		sellerDao.deleById(id);
		System.out.println("Delete completed!");
		
		input.close();
	}

}
