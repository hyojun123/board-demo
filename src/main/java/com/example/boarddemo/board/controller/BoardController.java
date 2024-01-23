package com.example.boarddemo.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/")
	public String www() {
		return "board/list";
	}

}
