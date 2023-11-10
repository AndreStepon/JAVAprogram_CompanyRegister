package lt.codeacademy.learn.firm.entities;

import javax.persistence.Entity;

@Entity
public class Employee {

	Long id;
	String fullName;
	Department department;
	
	public Employee(Long id, String fullName, Department department) {
		this.id = id;
		this.fullName = fullName;
		this.department = department;
	}

	public Employee(String fullName, Department department) {
		this.fullName = fullName;
		this.department = department;
	}
	
}
