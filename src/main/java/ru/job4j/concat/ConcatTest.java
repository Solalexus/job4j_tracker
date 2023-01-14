package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        String str1 = "abc" + "def" + "ghi";
        System.out.println(str1);
        StringBuilder str2 = new StringBuilder("abc");
        str2.append("def").append("ghi");
        System.out.println(str2);
    }
}
