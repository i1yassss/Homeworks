package com.hellogwt.shared.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "greetings")
public class Greeting implements Serializable {

    public Greeting(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public Greeting() {
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String author;

    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}