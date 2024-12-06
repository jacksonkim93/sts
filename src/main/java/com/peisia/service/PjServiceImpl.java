package com.peisia.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peisia.dto.PjDto;
import com.peisia.mapper.PjMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@AllArgsConstructor
public class PjServiceImpl implements PjService{

	@Setter(onMethod_ = @Autowired)
	private PjMapper mapper;

	@Override
	public ArrayList<PjDto> getPjList() {
		ArrayList<PjDto> n = mapper.getPjList();
		return n;
	}
}