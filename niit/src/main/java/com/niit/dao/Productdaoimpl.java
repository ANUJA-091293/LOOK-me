package com.niit.dao;

import java.util.List;


import javax.transaction.Transactional;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Product;


@Transactional
public class Productdaoimpl implements Productdao {
@Autowired
private SessionFactory session;
private String product_id;
@SuppressWarnings({"unchecked","deprecation"})

@Override
public List<Product> getAllproduct() {
	return session.getCurrentSession().createQuery("from Product").list();
}

@Override
public void insertProduct(Product p) {
	// TODO Auto-generated method stub
	session.getCurrentSession().persist(p);
	
}

@Override
public void deleteproID(int product_id) {
	session.getCurrentSession().delete(getProdID(product_id));
	
}


@Override
public List<Product> getProByCategory(String product_catg) {
	Query query=session.getCurrentSession().createQuery("from Product where product_catg=?");
	query.setParameter(0,product_catg );
  return query.list();
}


@Override
public void updateproduct(Product p) {
	
	
}

@Override
public Product getProdID(int proid) {
	Product p=session.getCurrentSession().get(Product.class,new Integer(proid));
	return p;
	
}

@Override
public List<Product> getProByBrand(String product_brand) {
	Query query=session.getCurrentSession().createQuery("from Product where product_brand=?");
	query.setParameter(0, product_brand);
	return query.list();
}

}
	
	
	
	

