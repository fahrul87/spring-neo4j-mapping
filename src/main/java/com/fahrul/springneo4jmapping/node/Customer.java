package com.fahrul.springneo4jmapping.node;

import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NodeEntity
public class Customer {
	@Id
	private int cid;
	private String name;
	private String[]  address;
	@Relationship(type = "Purchase",direction = Relationship.INCOMING)
	private List<Product> products;

}
