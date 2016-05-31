package ru.kpfu.itis.repository;

import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;

import java.util.List;

/**
 * Created by Ilyas on 29.05.2016.
 */
public interface BookmarkRepository {

    void addBookmark(User user, Bookmark bookmark);

    List<Bookmark> allUserBookmarks(User user);
}
