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


//@SpringBootApplication
public class SpringwithdatabaseappApplication implements 
					CommandLineRunner{

	@Autowired
	PersonJDBCDao dao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	public static void main(String[] args) {
		SpringApplication.run(SpringwithdatabaseappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			logger.info("All users -> {}",dao.findAll());
			
			logger.info("User id 1001 -> {}",dao.findById(1001));
			
			logger.info("Deleting 1002 -> No of rows deleted - {}",dao.deleteById(1002));
			
			logger.info("Insering 1004 -> {}",
					dao.insert(new Person(1004,"Shaekh Hasan","Khilgao", new Date())));
			
			logger.info("Updating 1003 -> {}",
					dao.update(new Person(1003,"Hasan Shoron","Dhaka Khilgao", new Date())));
			
			logger.info("All users -> {}",dao.findAll());
			
			
	}
}
