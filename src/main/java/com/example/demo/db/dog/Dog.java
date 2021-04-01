package com.example.demo.db.dog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Dog {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String author;
    private Date history;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public Date getHistory()
    {
        return history;
    }

    public void setHistory(Date history)
    {
        this.history = history;
    }
}