package com.article.controller;

import com.article.model.Article;
import com.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/article")
    public Article save(@RequestBody Article article){
        return articleService.save(article);
    }

    @GetMapping("/article/{id}")
    public Optional<Article> getById(@PathVariable(value = "id") Long id){
        return articleService.find(id);
    }

    @GetMapping("/article")
    public List<Article> getAll(){
        return articleService.findAll();
    }

    @DeleteMapping("/article/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        articleService.delete(id);
    }

    @DeleteMapping("/article")
    public void deleteAll(){
        articleService.deleteAll();
    }

    @GetMapping("/article/count")
    public long count(){
        return articleService.count();
    }
}