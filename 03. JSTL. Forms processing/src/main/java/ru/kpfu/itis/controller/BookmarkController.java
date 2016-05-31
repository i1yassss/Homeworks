package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.BookmarkRepository;
import ru.kpfu.itis.repository.UserRepository;
import ru.kpfu.itis.service.BookmarkService;
import ru.kpfu.itis.util.BookmarkFormValidator;

/**
 * Created by Ilyas on 29.05.2016.
 */
@Controller
public class BookmarkController {

    BookmarkFormValidator validator = new BookmarkFormValidator();

    @Autowired
    BookmarkService bookmarkService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookmarkRepository bookmarkRepository;

    @RequestMapping("/add_bookmark/{userid}")
    public String createBookmark(@PathVariable("userid") String userid, Model model) {
        Long userId = Long.parseLong(userid);
        User user = userRepository.findUserById(userId);
        Bookmark bookmark = new Bookmark();
        user.getBookmarks().add(bookmark);
        model.addAttribute("bookmark", bookmark);
        return "add-bookmark";
    }

    @RequestMapping(value = "/add_bookmark", method = RequestMethod.POST)
    public String saveBookmark(@ModelAttribute Bookmark bookmark, BindingResult result) {
        validator.validate(bookmark, result);
        if (result.hasErrors()) {
            return "add-bookmark";
        } else {
            return "redirect:/users/all";
        }
    }
}
