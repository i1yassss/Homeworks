package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.BookmarkRepository;

import java.util.List;

/**
 * Created by Ilyas on 29.05.2016.
 */
@Repository
public class BookmarkRepositoryImpl implements BookmarkRepository {

    @Override
    public void addBookmark(User user, Bookmark bookmark) {
        bookmark.setUserId(user.getId());
        user.setBookmark(bookmark);
    }

    @Override
    public List<Bookmark> allUserBookmarks(User user) {
        return user.getBookmarks();
    }
}
