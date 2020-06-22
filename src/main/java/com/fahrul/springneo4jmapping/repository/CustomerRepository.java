package com.fahrul.springneo4jmapping.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.fahrul.springneo4jmapping.node.Customer;

public interface CustomerRepository extends Neo4jRepository<Customer, Integer> {
	
	Customer findByName(String name);

}
