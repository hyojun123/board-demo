package com.example.boarddemo.board.mapper;


import com.example.boarddemo.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

	List<BoardDto> getList();
}
