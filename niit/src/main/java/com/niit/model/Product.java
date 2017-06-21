package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
private int product_id;
private String product_name;
private String product_brand;
private String product_catg;
private String product_subcatg;
private float product_price;
public int getProduct_id() {
	return product_id;
}

public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getProduct_brand() {
	return product_brand;
}
public void setProduct_brand(String product_brand) {
	this.product_brand = product_brand;
}
public String getProduct_catg() {
	return product_catg;
}
public void setProduct_catg(String product_catg) {
	this.product_catg = product_catg;
}
public String getProduct_subcatg() {
	return product_subcatg;
}
public void setProduct_subcatg(String product_subcatg) {
	this.product_subcatg = product_subcatg;
}
public float getProduct_price() {
	return product_price;
}
public void setProduct_price(float product_price) {
	this.product_price = product_price;
}

}
