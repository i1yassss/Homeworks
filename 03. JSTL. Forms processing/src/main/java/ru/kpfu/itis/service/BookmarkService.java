package ru.kpfu.itis.service;

import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;

/**
 * Created by Ilyas on 29.05.2016.
 */
public interface BookmarkService {

//    List<Bookmark> getAll();

    void addBookmark(User user, Bookmark bookmark);
}
