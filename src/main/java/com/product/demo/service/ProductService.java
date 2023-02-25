package com.product.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.entity.Charges;
import com.product.demo.entity.Product;
import com.product.demo.repository.ChargeRepository;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ChargeRepository chargeRepository;
	
	public List<Product> getAllProducts(){
		List<Product> product =new ArrayList<>();
		productRepository.findAll().forEach(product::add);
		return product;
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public Product getProductById(long id) {
		return productRepository.findById(id).get();
	}
	
	public Product updateProduct(Product product,long id) {
		product.setProductId(id);
		product.setProductName(product.getProductName());
		product.setProductType(product.getProductType());
		product.setProductCategory(product.getProductCategory());
		product.setProductPrice(product.getProductPrice());
		 return productRepository.save(product);	}

	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}
	
   public Product getProducts(long id) {
		
		Product product = productRepository.findById(id).get();
		long cid = product.getCharges().getId();
		Charges c = chargeRepository.findById(cid).get();
		
		double disp = product.getDiscount();
		double gstp = product.getCharges().getGst();
		double deli  = product.getCharges().getDelivery();
		
		double dis = (disp/100)* product.getProductPrice();
		double dis_price = product.getProductPrice() - dis;
		double gst_price = (gstp/100)*dis_price;
		double final_price = dis_price + gst_price + deli;
		
		System.out.println(final_price);
		c.setGst(gst_price);
		c.setDelivery(deli);
		product.setCharges(c);
		product.setDiscount(dis);
		product.setFinalPrice(final_price);
		
		return product;
		
	}
	
	
}
