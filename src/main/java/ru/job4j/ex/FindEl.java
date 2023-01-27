package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Array dos not contain a matching element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E"};
        String key = "e";
        try {
            indexOf(letters, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
