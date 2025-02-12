package com.zerock.springboot_board.dto;

import lombok.Data;
import lombok.ToString;

@Data
public class BoardDto {
    private long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContent;
    private int boardHits;
    private String createAt;
}
