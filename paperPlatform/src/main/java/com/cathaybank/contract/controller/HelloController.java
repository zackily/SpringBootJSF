//package com.cathaybank.contract.controller;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cathaybank.rcmm.entity.Announcement;
//import com.cathaybank.rcmm.service.AnnouncementService;
//
//@RestController
//@RequestMapping(value = "/announcements/")
//public class HelloController {
//	@Resource
//	private AnnouncementService service;
//
//	@GetMapping
//	public List<Contract> getAnnouncement() {
//		List<Contract> list = service.queryList();
//		return list;
//	}
//
//	@PostMapping(value = "add")
//	public void addContact() {
//		for (int i = 100; i < 200; i++) {
//			Contract am = new Contract();
//			am.setId("000" + i);
//			am.setChannel("E-mail/對帳單/APP/網銀/臨櫃");
//			am.setContract("特定金錢信託");
//			am.setContent("OOOOOOOOOO");
//			am.setEndDate(new Date());
//			am.setEventDate(new Date());
//			am.setEventType("合併");
//			am.setProductCode("000" + i);
//			am.setProductName("XXXX" + i);
//			am.setProductType("基金");
//			am.setTarget("有庫存客戶");
//			service.addEntity(am);
//		}
//	}
//
//}
