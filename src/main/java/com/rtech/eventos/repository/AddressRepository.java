package com.rtech.eventos.repository;

import com.rtech.eventos.domain.Address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
