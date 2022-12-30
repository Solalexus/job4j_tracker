package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kolobanov Vladimir Ivanovich");
        student.setGroup("E-12");
        student.setDataAdmission("30.12.22");
        System.out.println("Ф.И.О. - " + student.getName());
        System.out.println("Группа - " + student.getGroup());
        System.out.println("Дата поступления - " + student.getDataAdmission());
    }
}
