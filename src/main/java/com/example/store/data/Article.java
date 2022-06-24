package com.example.store.data;

public class Article {

    private String articleName;
    private Double price;
    private ArticleCategory articleCategory;

    public Article() {
    }

    public Article(String articleName, Double price, ArticleCategory articleCategory) {
        this.articleName = articleName;
        this.price = price;
        this.articleCategory = articleCategory;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ArticleCategory getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(ArticleCategory articleCategory) {
        this.articleCategory = articleCategory;
    }
}
