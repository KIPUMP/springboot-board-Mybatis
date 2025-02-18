package com.zerock.springboot_board.service;

import com.zerock.springboot_board.dto.BoardDto;
import com.zerock.springboot_board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDto boardDto){
        boardRepository.save(boardDto);
    }
}
