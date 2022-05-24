package com.kt.edu.secondproject.controller;


import com.kt.edu.secondproject.domain.Article;
import com.kt.edu.secondproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> findAll() {
        return this.articleService.findAll();
    }

    @GetMapping("/{id}")
    public Article findById(@PathVariable Long id) {
        return this.articleService.findById(id);
    }

   /* @GetMapping("/active")
    public List<Article> findAllActive() {
        return this.articleService.findAllActive();
    }

    @GetMapping("/inactive")
    public List<Article> findAllInactive() {
        return this.articleService.findAllInactive();
    }*/

    @PostMapping
    public Article create(@RequestBody Article article) {
        return this.articleService.create(article);
    }

    /*@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.articleService.delete(id);
    }*/
}