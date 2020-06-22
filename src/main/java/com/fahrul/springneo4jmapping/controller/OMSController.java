package com.fahrul.springneo4jmapping.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springneo4jmapping.node.Customer;
import com.fahrul.springneo4jmapping.node.Product;
import com.fahrul.springneo4jmapping.repository.CustomerRepository;

@RestController
public class OMSController {
	
	@Autowired
	private CustomerRepository repository;
	
	@PostConstruct
	public void purchaseOrder() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(998,"HeadSeat",1,10000));
		products.add(new Product(667,"Cashger",4,120000));
		Customer customer = new Customer();
		customer.setCid(446);
		customer.setName("azriel");
		customer.setAddress(new String[] {"Magetan","Jawa"});
		customer.setProducts(products);
		repository.save(customer);
	}
	
	@GetMapping("/getOrders")
	public List<Customer> getPurchaseOrder(){
		return (List<Customer>) repository.findAll();
	}
	
	@GetMapping("/getInfo/{name}")
	public Customer getInfo(@PathVariable String name) {
		return repository.findByName(name);
	}

}
