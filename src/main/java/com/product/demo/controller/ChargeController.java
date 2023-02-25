package com.product.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.entity.Charges;
import com.product.demo.service.ChargeService;

@RestController
@RequestMapping("/c")
public class ChargeController {
	
	@Autowired
	private ChargeService chargeService;
	
	@PostMapping("/add")
	public void add(@RequestBody Charges c) {
		chargeService.add(c);
	}

//	@GetMapping("/charges")
//	public List<Charge> getCharges() {
//		return chargeService.getAllCharges();
//	}
}
