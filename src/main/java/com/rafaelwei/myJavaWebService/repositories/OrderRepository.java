package com.rafaelwei.myJavaWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelwei.myJavaWebService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
