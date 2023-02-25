package com.product.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "charge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Charges {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "gst", nullable = false)
	private Double gst;
	
	@Column(name = "delivery", nullable = false)
	private Double delivery;
		
}
