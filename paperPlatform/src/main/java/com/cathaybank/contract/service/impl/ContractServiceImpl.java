package com.cathaybank.contract.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cathaybank.contract.entity.Contract;
import com.cathaybank.contract.repository.ContractRepository;
import com.cathaybank.contract.service.ContractService;

@Service
@Transactional
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractRepository repository;

	@Override
	public List<Contract> queryList() {
		List<Contract> list = new ArrayList<Contract>();
		list = repository.findAll();
		return list;
	}

	@Override
	public void addEntity(Contract entity) {
		repository.save(entity);
	}

}
