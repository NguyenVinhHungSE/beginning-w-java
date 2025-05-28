import School.Student;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        Student[] students = null;


        while (students == null) {
            try {
                System.out.print("Enter number: ");
                int n = Integer.parseInt(sc.nextLine());
                students = new Student[n];

            } catch (Exception e) {
                System.out.println("Error size, Try again: ");
                ;
            }
        }

        do {
            System.out.println("___MENU___");
            System.out.println("1.Input");
            System.out.println("2.Output");
            System.out.println("3.Search by ID");
            System.out.println("4.Exit");
            choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    for (int i = 0; i < students.length; i++) {
                        students[i] = input(sc);
                    }
                    break;
                }
                case "2":
                    sortStudent(students);
                    for (int i = 0; i < students.length; i++) {
                        students[i].showProfile();
                    }
                    break;
                case "3":
                    System.out.print("ID Student finding: ");
                    String indexId = sc.nextLine();
                    searchId(indexId, students);
                    break;
                case "4":
                    System.out.println("Exiting!...");
                    break;
                default:
                    System.out.print("Invalid, Enter again: ");
                    System.out.println(" ");
                    break;
            }
        } while (!choice.equals("4"));

    }


    public static void sortStudent(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getMark() < students[j].getMark()) {
                    Student x;
                    x = students[i];
                    students[i] = students[j];
                    students[j] = x;
                }
            }
        }

    }

    public static Student input(Scanner sc) {

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("ID: ");
        String id = sc.nextLine();
        int age = 0;
        double mark = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Age: ");
                age = Integer.parseInt(sc.nextLine());
                validInput = true;
                break;
            } catch (Exception e) {
                System.out.print("Incoret format! Try again: ");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Mark: ");
                mark = Double.parseDouble(sc.nextLine());
                validInput = true;
                break;
            } catch (Exception e) {
                System.out.print("Incoret format! Try again: ");
            }
        }


        return new Student(name, id, age, mark);
    }

    public static void searchId(String indexId, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if ((students[i].getId()).equals(indexId)) {
                students[i].showProfile();
                return;
            }
        }
        System.out.println("Can not find student with ID: " + indexId);
    }
}
