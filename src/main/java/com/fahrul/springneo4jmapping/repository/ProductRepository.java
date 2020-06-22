package com.fahrul.springneo4jmapping.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.fahrul.springneo4jmapping.node.Product;

public interface ProductRepository extends Neo4jRepository<Product, Integer>{

}
