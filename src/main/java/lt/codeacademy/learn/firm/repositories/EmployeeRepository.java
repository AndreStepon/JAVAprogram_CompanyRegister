package lt.codeacademy.learn.firm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.codeacademy.learn.firm.entities.Employee;

public interface EmployeeRepository extends  JpaRepository<Employee, Long>{

}
