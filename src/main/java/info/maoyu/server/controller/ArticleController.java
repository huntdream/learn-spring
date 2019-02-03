package info.maoyu.server.controller;

import info.maoyu.server.dao.ArticleMapper;
import info.maoyu.server.model.Article;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping(value = "/query", params = "suffixCode")
    @ResponseBody
    public Article findArticleBySuffixCode(@RequestParam("suffixCode") String suffixCode) {
        return this.articleMapper.findArticleBySuffixCode(suffixCode);
    }

    @RequestMapping(value = "/query", params = "author", method = RequestMethod.GET)
    @ResponseBody
    public List<Article> findArticleByAuthor(@RequestParam("author") String author) {
        return this.articleMapper.findArticleByAuthor(author);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void saveArticle(@Valid @RequestBody Article article) {
        this.articleMapper.saveArticle(article);
    }
}
