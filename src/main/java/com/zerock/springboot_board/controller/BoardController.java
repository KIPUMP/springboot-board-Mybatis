package com.zerock.springboot_board.controller;

import com.zerock.springboot_board.dto.BoardDto;
import com.zerock.springboot_board.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    @Autowired
    private final BoardService boardService;

    @GetMapping("/save")
    public String save(){
        return "save";
    }

    @PostMapping("/save")
    public void save(BoardDto boardDto){
        boardService.save(boardDto);
    }
}
