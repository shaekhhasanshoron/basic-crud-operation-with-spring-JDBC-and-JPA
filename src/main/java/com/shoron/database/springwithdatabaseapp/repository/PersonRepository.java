package com.shoron.database.springwithdatabaseapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.shoron.database.springwithdatabaseapp.Model.Person;

@Repository
@Transactional // for updating the database
public class PersonRepository {

	@PersistenceContext
	EntityManager entityManager; // for communicating with db
	// entity manager is the interface for persistence context

	public List<Person> findAll(){
		// writing a jpql
	
		// witing a named query 
		//this named query "find_all_persons will return Person class"
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons",Person.class);
		return namedQuery.getResultList();
	
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(int id) {
		Person person=findById(id);
		entityManager.remove(person);
	}
	
	
}
