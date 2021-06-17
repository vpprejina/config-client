package com.example.configclient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class DemoController {
	
	private EntityManagerFactory entityManagerFactory;
	@PersistenceUnit 
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
	@Autowired
	abc configProps;
	
	@RequestMapping("/test")
	public String test(){
		
		System.out.println(" my name in controller got "+configProps.getAddress());
		
		insert(configProps);
		return "name is = "+configProps.getName()+"  "  + "age is = " +configProps.getAge() +"  " +"address is = "+  configProps.getAddress();
		
	}
	
	
	public void insert(abc configProps) {
		
	
		System.out.println(" inside insert method "+configProps.getId());
		
		EntityManager entityManager =this.entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(configProps);
		entityManager.getTransaction().commit();
		System.out.println(" data inserted sucessfully");
	}
	
}


