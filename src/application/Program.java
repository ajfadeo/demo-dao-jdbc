package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1,"books");
		
		Seller seller = new Seller(21, "Bob", "bobgmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		System.out.println(obj);
		
		System.out.println(seller);
		
	}

}
