package org.example.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/article")
@RestController
public class ArticleController {

    @GetMapping("/test")
    public String getTest() {
        return "ArticleController - 테스트 성공";
    }
}
