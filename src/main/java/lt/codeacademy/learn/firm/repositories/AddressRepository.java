package lt.codeacademy.learn.firm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.codeacademy.learn.firm.entities.Address;

public interface AddressRepository extends  JpaRepository<Address, Long>{

}
