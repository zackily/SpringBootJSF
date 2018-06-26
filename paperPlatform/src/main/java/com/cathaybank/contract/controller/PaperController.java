package com.cathaybank.contract.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cathaybank.contract.entity.Paper;
import com.cathaybank.contract.service.PaperService;

@Scope(value = "session")
@Component(value = "paperController")
public class PaperController {

	private List<Paper> master;

	private Paper item;
	@Resource
	private PaperService service;

	@PostConstruct
	public void loadData() {
		this.master = service.queryList();
		this.item = new Paper();
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("編輯事件範本", ((Paper) event.getObject()).getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("編輯取消", ((Paper) event.getObject()).getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Paper> getMaster() {
		return master;
	}

	public void setMaster(List<Paper> master) {
		this.master = master;
	}

	public Paper getItem() {
		return item;
	}

	public void setItem(Paper item) {
		this.item = item;
	}

}
