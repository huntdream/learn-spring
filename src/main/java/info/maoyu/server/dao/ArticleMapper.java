package info.maoyu.server.dao;

import info.maoyu.server.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface ArticleMapper {
    List<Article> findAllArticle();

    Article findArticleByTitle(String name);

    List<Article> findArticleByAuthor(String name);

    Article findArticleById(int id);

    Article findArticleBySuffixCode(String suffixCode);

    void saveArticle(Article article);
}
