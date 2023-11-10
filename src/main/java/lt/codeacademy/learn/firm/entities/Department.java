package lt.codeacademy.learn.firm.entities;

import javax.persistence.Entity;

@Entity
public class Department {

	Long id;
	String name;
	Address address;
	
	public Department(Long id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Department(String name, Address address) {
		this.name = name;
		this.address = address;
	}
}
