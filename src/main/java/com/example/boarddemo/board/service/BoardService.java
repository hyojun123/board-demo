package com.example.boarddemo.board.service;

import com.example.boarddemo.board.dto.BoardDto;
import com.example.boarddemo.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;

	public List<BoardDto> getList() {
		return boardMapper.getList();
	}
}
