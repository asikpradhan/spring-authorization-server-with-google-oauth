package com.example.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {
    @GetMapping("/articles")
    public String[] getArticles() {
        return new String[]{"Article1", "Article2", "Article3"};
    }
}
