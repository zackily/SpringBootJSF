package com.cathaybank.contract.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cathaybank.contract.entity.Contract;
import com.cathaybank.contract.service.ContractService;

@Scope(value = "session")
@Component(value = "contractController")
public class ContractQueryController {

	private List<Contract> master;

	private Contract item;
	@Autowired
	private ContractService service;

	@PostConstruct
	public void loadData() {
		this.master = service.queryList();
		this.item = new Contract();
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("編輯訊息", ((Contract) event.getObject()).getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("編輯取消", ((Contract) event.getObject()).getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Contract> getMaster() {
		return master;
	}

	public void setMaster(List<Contract> master) {
		this.master = master;
	}

	public Contract getItem() {
		return item;
	}

	public void setItem(Contract item) {
		this.item = item;
	}

}
