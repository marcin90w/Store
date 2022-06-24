package com.example.store.data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class ArticleController {

    private ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/category")
    public String mainPage(Model model, @RequestParam(required = false, name="category") ArticleCategory articleCategory) {
        Set<Article> articles;
        if (articleCategory != null) {
            articles = articleRepository.findByCategory(articleCategory);
        } else {
            articles = articleRepository.findAll();
        }
        model.addAttribute("articles", articles);
        return "display";
    }

    @GetMapping("/dodaj")
    public String addForm(Model model) {
        model.addAttribute("article", new Article());
        return "add";
    }

    @PostMapping("/dodaj")
    public String add(Article article) {
        articleRepository.addArticle(article);
        return "redirect:/";
    }
}
