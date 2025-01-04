package com.batchprocessing.batch.processing.demo.config;

import com.batchprocessing.batch.processing.demo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

//Item Proccessor<input type, output type>
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
