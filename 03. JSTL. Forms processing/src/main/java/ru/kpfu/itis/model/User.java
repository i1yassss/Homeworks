package ru.kpfu.itis.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static Long userCount = Long.valueOf(0);

    public static long incUserCount() {
        return userCount++;
    }

    private Long id;

    private String name;

    private String surname;

    private String login;

    private String password;

    private String age;

    private List<Bookmark> bookmarks = new ArrayList<>();

    public User() {
        this.id = incUserCount();
    }

    public User(String name, String surname, String login, String password, String age) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.age = age;
        this.id = incUserCount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public void setBookmark(Bookmark bookmark) {
        this.bookmarks.add(bookmark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
