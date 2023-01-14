package ru.job4j.concat;

public class ConcatExample {
    public static void main(String[] args) {
        String str = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(str);
        String str2 = String.join(" ", "abc", "def", "ghi");
        System.out.println(str2);
    }
}
