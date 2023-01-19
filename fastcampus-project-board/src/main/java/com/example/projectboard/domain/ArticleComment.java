package com.example.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private Article article; // 제목
    private String contents; // 본문

    private LocalDateTime createdAt; // 생성일시
    private String createdby; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자

}
