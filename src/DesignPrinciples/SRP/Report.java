package DesignPrinciples.SRP;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class Report {
   private String title;
   private String description;
   private String author;
   private Date createdAt;
   private List<String> data;

    public Report(String title, String description, String author, Date createdAt, List<String> data) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.createdAt = createdAt;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
