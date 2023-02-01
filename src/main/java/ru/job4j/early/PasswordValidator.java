package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {
    public static String validate(String password) {
        boolean exception = true;
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (int i = 0; i < password.length(); i++) {
            if (isUpperCase(password.codePointAt(i))) {
                exception = false;
                break;
            }
        }
        if (exception) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        exception = true;
        for (int i = 0; i < password.length(); i++) {
            if (isLowerCase(password.codePointAt(i))) {
                exception = false;
                break;
            }
        }
        if (exception) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        exception = true;
        for (int i = 0; i < password.length(); i++) {
            if (isDigit(password.codePointAt(i))) {
                exception = false;
                break;
            }
        }
        if (exception) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        exception = true;
        for (int i = 0; i < password.length(); i++) {
            if (!isDigit(password.codePointAt(i)) && !isAlphabetic(password.codePointAt(i))) {
                exception = false;
                break;
            }
        }
        if (exception) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String low = password.toLowerCase();
        if (low.contains("qwerty") || low.contains("12345") || low.contains("password")
                || low.contains("admin") || low.contains("user")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
