package com.peisia.mapper;

import java.util.ArrayList;

import com.peisia.dto.CardDto;
import com.peisia.dto.SelectCardDto;

public interface CardMapper {
	public ArrayList<CardDto> getList();
	public void addCard(CardDto c);
	public void pjMemberAdd(SelectCardDto c);
	public ArrayList<CardDto> getPjMember(int no);
	public void clearPjMember();
}
