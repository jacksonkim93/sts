package com.peisia.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peisia.dto.PjDto;
import com.peisia.service.PjService;

import lombok.Setter;

@CrossOrigin(origins = "http://localhost:3000") // 3000포트에서의 요청 허용
@RequestMapping("/pj/*")
@RestController
public class PjController {
	
	@Setter(onMethod_ = @Autowired)
	private PjService service;	
	
	@RequestMapping("/getPjList")			
	public ArrayList<PjDto> getPjList() {
		ArrayList<PjDto> n = service.getPjList();
		System.out.println("==== 총 pj 수:"+n.size());
		return n;
	}
	
}
