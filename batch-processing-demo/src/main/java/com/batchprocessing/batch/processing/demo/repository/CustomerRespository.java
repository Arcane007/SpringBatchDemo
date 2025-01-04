package com.batchprocessing.batch.processing.demo.repository;

import com.batchprocessing.batch.processing.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends JpaRepository<Customer,Integer> {
}
