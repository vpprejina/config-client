package com.example.configclient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Component
@ConfigurationProperties()
@Table
public class abc {

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private String age;
	
	@Column(name="address")
	private String address;
	
	public abc() {
	}
	
	public abc(int id, String name, String age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ConfigProps [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//System.out.println("calling here"+name);
		
		this.name = name;
		
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
	//	System.out.println("calling here"+age);
		
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		//System.out.println("calling here"+address);
		
		this.address = address;
	}

	
}