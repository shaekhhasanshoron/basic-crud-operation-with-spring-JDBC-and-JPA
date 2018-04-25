package com.shoron.database.springwithdatabaseapp;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shoron.database.springwithdatabaseapp.Dao.PersonJDBCDao;
import com.shoron.database.springwithdatabaseapp.Model.Person;
import com.shoron.database.springwithdatabaseapp.repository.PersonRepository;
import com.shoron.database.springwithdatabaseapp.springdata.PersonSpringDataRepository;


@SpringBootApplication
public class SpringwithdatabaseappApplicationWithSpringData implements 
					CommandLineRunner{

	@Autowired
	PersonSpringDataRepository personRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	public static void main(String[] args) {
		SpringApplication.run(SpringwithdatabaseappApplicationWithSpringData.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
						
		logger.info("User id 1001 -> {}",personRepository.findById(1001));

		logger.info("Insering -> {}",
		personRepository.save(new Person("Shaekh Hasan","Khilgao", new Date())));

		logger.info("Updating 1003 -> {}",
		personRepository.save(new Person(1003,"Hasan Shoron","Dhaka Khilgao", new Date())));

		personRepository.deleteById(1002);
		
		logger.info("All users -> {}",personRepository.findAll());

			
			
	}
}
