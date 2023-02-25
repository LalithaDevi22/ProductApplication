package com.product.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.entity.Charges;
import com.product.demo.repository.ChargeRepository;

@Service
public class ChargeService {
	
	@Autowired
	private ChargeRepository chargeRepository;
	
	public void add(Charges c) {
		//product.setProductCategory(product.getProductCategory());
		chargeRepository.save(c);
	}

	
//	public List<Charge> getAllCharges(Product product){
//		List<Charge> charge =new ArrayList<>();
//		String c = product.getProductCategory();
//		chargeRepository.findAll().forEach(charge::add);
//		return charge;
//	}
}
