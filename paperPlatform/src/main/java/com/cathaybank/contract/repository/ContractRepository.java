package com.cathaybank.contract.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cathaybank.contract.entity.Contract;

public interface ContractRepository extends JpaRepository<Contract, String> {

}
