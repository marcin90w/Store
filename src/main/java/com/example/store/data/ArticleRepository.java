package com.example.store.data;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class ArticleRepository {

    private Set<Article> articleSet;

    public ArticleRepository(Set<Article> articleSet) {
        this.articleSet = articleSet;
    }
}
