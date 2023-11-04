package org.jt.onetoonerelationship.repository;

import org.jt.onetoonerelationship.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {

}