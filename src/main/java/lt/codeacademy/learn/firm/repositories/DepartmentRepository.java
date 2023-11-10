package lt.codeacademy.learn.firm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.codeacademy.learn.firm.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
