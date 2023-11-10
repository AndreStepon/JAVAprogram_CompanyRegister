package lt.codeacademy.learn.firm.entities;

import javax.persistence.Entity;

@Entity
public class Address {
	
	Long id;
	String street;
	String city;
	String country;
	public Address(Long id, String street, String city, String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}
}
