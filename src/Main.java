import School.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number student: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudent();
        }

        for (int i = 0; i < students.length-1; i++) {
            for (int j = i+1; j < students.length; j++) {
                if(students[i].getMark() < students[j].getMark()){
                    Student x = students[i];
                    students[i] = students[j];
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            students[i].showProfile();
        }
    }


    public static Student createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Mark: ");
        double mark = sc.nextDouble();

        return new Student(name, id ,age, mark);
    }

}