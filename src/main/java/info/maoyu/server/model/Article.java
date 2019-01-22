package info.maoyu.server.model;

import java.util.Date;

public class Article {
    private int id;
    private String title;
    private Date created_at;
    private Date modified_at;
    private String author;
    private String content;
    private String category;
    private int comments;

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getContent(){
        return this.content;
    }

    public String getCategory(){
        return this.category;
    }
}
