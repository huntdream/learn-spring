package info.maoyu.server.controller;

import info.maoyu.server.dao.ArticleMapper;
import info.maoyu.server.model.Article;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    private ArticleMapper articleMapper;

    public ArticleController(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Article> findAllArticle() {
        return this.articleMapper.findAllArticle();
    }

    @GetMapping(value = "/query", params = "id")
    @ResponseBody
    public Article findArticleById(@RequestParam("id") int id) {
        return this.articleMapper.findArticleById(id);
    }

    @RequestMapping(value = "/query", params = "author")
    @ResponseBody
    public List<Article> findArticleByAuthor(@RequestParam("author") String author) {
        return this.articleMapper.findArticleByAuthor(author);
    }
}
