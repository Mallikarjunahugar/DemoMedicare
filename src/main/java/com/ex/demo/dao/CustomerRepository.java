package com.ex.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.demo.entity.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}