package School;

import java.util.Scanner;

public class Student {
    String name;
    String id;
    int age;
    double mark;
    Scanner sc = new Scanner(System.in);
    public Student(String name, String id, int age, double mark) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.mark = mark;
    }


    public void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("________");
    }



    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }
}

