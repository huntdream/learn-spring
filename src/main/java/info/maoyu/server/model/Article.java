package info.maoyu.server.model;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class Article {
    private int id;

    @NotEmpty(message = "Title is required")
    private String title;

    private Date created_at;
    private Date modified_at;
    private String author;

    @NotEmpty(message = "Content is required")
    private String content;
    private String category;
    private int comments;
    private String suffixCode;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public String getCategory() {
        return this.category;
    }

    public String getSuffixCode() {
        return this.suffixCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
