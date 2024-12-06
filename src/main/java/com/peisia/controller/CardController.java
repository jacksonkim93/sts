package com.peisia.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peisia.dto.CardDto;
import com.peisia.dto.SelectCardDto;
import com.peisia.service.CardService;

import lombok.Setter;

@CrossOrigin(origins = "http://localhost:3000") // 3000포트에서의 요청 허용
@RequestMapping("/card/*")
@RestController
public class CardController {
	
	@Setter(onMethod_ = @Autowired)
	private CardService service;	
	
	@RequestMapping("/getMyCards")			
	public ArrayList<CardDto> getMyCards() {
		ArrayList<CardDto> n = service.getList();
		System.out.println("==== 총 카드 수:"+n.size());
		return n;
	}
	
	@RequestMapping("/pjMemberAdd")			
	public void pjMemberAdd(@RequestBody SelectCardDto c) {
//		CardDto c = new CardDto((String)requestData.get("job"),(String)requestData.get("grade"));
		service.pjMemberAdd(c);
		System.out.println("==== 데이터 잘 오나?: id:"+c.getId());
		System.out.println("==== 데이터 잘 오나?: no:"+c.getNo());
	}
	
	@RequestMapping("/getPjMember")			
	public ArrayList<CardDto> getParty(@RequestParam("no") int no) {
//	public ArrayList<CardDto> getPjMember() {
		ArrayList<CardDto> n = service.getPjMember(no);
		System.out.println("==== pj 멤버 카드 수:"+n.size());
		return n;
	}	
	
	@RequestMapping("/clearPjMember")			
	public void clearPjMember() {
		service.clearPjMember();
	}	
}
