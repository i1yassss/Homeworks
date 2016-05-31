package ru.kpfu.itis.model;

/**
 * Created by Ilyas on 29.11.2016.
 */

public class Bookmark {
    private String siteName;
    private String url;
    private long userId;

    public Bookmark() {
    }

    public Bookmark(String siteName, String url) {
        this.siteName = siteName;
        this.url = url;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
}
