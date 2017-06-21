package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface Productdao {
public List<Product> getAllproduct();
public void insertProduct(Product p);
public void deleteproID(int product_id);
public List<Product> getProByCategory(String product_catg);
public void updateproduct(Product p);
public Product getProdID(int proid);
public List <Product> getProByBrand(String product_brand);

}
