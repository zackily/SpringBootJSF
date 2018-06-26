package com.cathaybank.contract.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cathaybank.contract.entity.Paper;
import com.cathaybank.contract.repository.PaperRepository;
import com.cathaybank.contract.service.PaperService;

@Service
@Transactional
public class PaperServiceImpl implements PaperService {
	@Resource
	private PaperRepository repository;

	@Override
	public List<Paper> queryList() {
		List<Paper> list = new ArrayList<Paper>();
		list = repository.findAll();
		return list;
	}

	@Override
	public void addEntity(Paper entity) {
		repository.save(entity);
	}

}
