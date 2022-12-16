package com.article.service;

import com.article.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    Article save(Article article);

    Optional<Article> find(Long id);

    List<Article> findAll();

    List<Article> findAll(List<Long> ids);

    List<Article> findAll(Sort sort);

    Page<Article> findAll(Pageable pageable);

    void delete(Long id);

    void delete(List<Article> article);

    void delete(Article article);

    void deleteAll();

    long count();

}