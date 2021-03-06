package ru.kpfu.itis.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.itis.model.Bookmark;

/**
 * Created by Ilyas on 29.05.2016.
 */
public class BookmarkFormValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Bookmark.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Bookmark bookmark = (Bookmark) target;
        if (bookmark.getSiteName() == null || bookmark.getSiteName().isEmpty()) {
            errors.rejectValue("siteName", "", "��� �� ����� ���� ������");
        }
        if (bookmark.getUrl() == null || bookmark.getUrl().isEmpty()) {
            errors.rejectValue("url", "", "URL �� ����� ���� ������");
        }
    }
}
