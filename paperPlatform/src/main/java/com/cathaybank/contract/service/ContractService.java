package com.cathaybank.contract.service;

import java.util.List;

import com.cathaybank.contract.entity.Contract;

public interface ContractService {

	List<Contract> queryList();
	
	void addEntity(Contract entity);
}
