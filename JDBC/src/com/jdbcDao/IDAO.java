package com.jdbcDao;

import java.util.Collection;

public interface IDAO<T, K> {    // generic interface for CRUD operation
	
	void create(T t);// add a new entity
	
	Collection<T> getAll();// retrieve all entities
	 
	T getOne(K key); //retrieve one entity against ID
	
	void update (T t); // update the entity
	
	void deleteOne(K key);// delete the entity against the ID
	
	
	

}
