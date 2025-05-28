import School.Student;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());
        String choice;
        Student[] students = new Student[n];

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
                    sortStudent( students);
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
                    break;
            }
        } while (!choice.equals("4"));
    }

    public static void sortStudent(Student[] students){

        for (int i = 0; i < students.length-1; i++) {
            for (int j = i+1; j < students.length; j++) {
                if (students[i].getMark() < students[j].getMark()){
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

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Mark: ");
        double mark = Double.parseDouble(sc.nextLine());

        return new Student(name, id, age, mark);
    }

    public static void searchId(String indexId,Student[] students){
        for (int i = 0; i < students.length; i++) {
            if ((students[i].getId()).equals(indexId))  students[i].showProfile();
         }
    }
}
