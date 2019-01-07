package info.maoyu.server.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

public class User  {
    private int id;
    private String username;
    private String name;
    private String password;
    private Date created_at;

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public Date getCreatedAt(){
        return this.created_at;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
