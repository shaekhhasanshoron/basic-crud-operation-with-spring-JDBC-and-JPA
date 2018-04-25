package com.shoron.database.springwithdatabaseapp.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoron.database.springwithdatabaseapp.Model.Person;

public interface PersonSpringDataRepository
				extends  JpaRepository<Person, Integer>{

}
