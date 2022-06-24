package com.example.store.data;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class ArticleRepository {

    private Set<Article> articleSet;

    public ArticleRepository() {
        articleSet = new HashSet<>();
        articleSet.add(new Article("Czereśnie", 200.0, ArticleCategory.FOOD));
        articleSet.add(new Article("Schab", 25.99, ArticleCategory.FOOD));
        articleSet.add(new Article("Sok", 4.20, ArticleCategory.FOOD));
        articleSet.add(new Article("Pralka", 1300.0, ArticleCategory.AGD));
        articleSet.add(new Article("Mikser", 199.99, ArticleCategory.AGD));
        articleSet.add(new Article("Chleb zwykły", 7.0, ArticleCategory.FOOD));
        articleSet.add(new Article("Pilnik", 3.5, ArticleCategory.OTHERS));
        articleSet.add(new Article("Szczoteczka do zębów", 9.8, ArticleCategory.OTHERS));
    }

    public Set<Article> findAll() {
        return articleSet;
    }

    public Set<Article> findByCategory(ArticleCategory category) {
        return articleSet.stream()
                .filter(article -> category.equals(article.getArticleCategory()))
                .collect(Collectors.toSet());
    }

    public void addArticle(Article article) {
        articleSet.add(article);
    }
}
