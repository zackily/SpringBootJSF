package com.cathaybank.contract.service;

import java.util.List;

import com.cathaybank.contract.entity.Paper;

public interface PaperService {

	List<Paper> queryList();

	void addEntity(Paper entity);
}
