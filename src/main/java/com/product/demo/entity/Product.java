package com.product.demo.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ProductId")
	private Long productId;

	@Column(name = "ProductName", nullable = false)
	private String productName;

	@Column(name = "ProductType", nullable = false)
	private String productType;

	@Column(name = "ProductCategory", nullable = false)
	private String productCategory;

	@Column(name = "ProductPrice", nullable = false)
	private Double productPrice;
	
	@Column(name = "discount")
	private Double discount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Charges charges;
	
	@Column(name = "finalPrice")
	private Double finalPrice;
	
}
