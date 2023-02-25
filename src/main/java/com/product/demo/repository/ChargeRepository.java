package com.product.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.demo.entity.Charges;

@Repository
public interface ChargeRepository extends JpaRepository<Charges, Long> {

}
