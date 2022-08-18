package model.dao;

import java.util.List;

import mode.entities.Seller;

public interface SellerDao {

	void insert(Seller seller);

	void update(Seller seller);

	void deleById(Integer id);

	Seller findById(Integer id);

	List<Seller> findAll();

}
