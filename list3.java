import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            students.add(name);
            marks.add(mark);
        }

        System.out.println("\nStudent Details");

        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int i = 0; i < students.size(); i++) {

            System.out.println(
                (i + 1) + ". " +
                students.get(i) + " - " +
                marks.get(i)
            );

            total += marks.get(i);

            if (marks.get(i) > highest) {
                highest = marks.get(i);
            }

            if (marks.get(i) < lowest) {
                lowest = marks.get(i);
            }
        }

        double average = (double) total / marks.size();

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        System.out.println("\nGrades:");

        for (int i = 0; i < students.size(); i++) {

            int mark = marks.get(i);
            String grade;

            if (mark >= 90) {
                grade = "A+";
            } else if (mark >= 80) {
                grade = "A";
            } else if (mark >= 70) {
                grade = "B";
            } else if (mark >= 60) {
                grade = "C";
            } else if (mark >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println(students.get(i) + " : " + grade);
        }

        System.out.print("\nEnter student name to search: ");
        String search = sc.nextLine();

        int index = students.indexOf(search);

        if (index != -1) {
            System.out.println(
                search + " scored " + marks.get(index) + " marks."
            );
        } else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
