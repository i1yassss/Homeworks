package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.BookmarkRepository;
import ru.kpfu.itis.service.BookmarkService;

/**
 * Created by Ilyas on 29.05.2016.
 */
@Service
public class BookmarkServiceImpl implements BookmarkService {

    @Autowired
    BookmarkRepository repository;

    @Override
    public void addBookmark(User user, Bookmark bookmark) {
        if (bookmark == null || user == null) {
            return;
        }
        repository.addBookmark(user, bookmark);
    }
}
