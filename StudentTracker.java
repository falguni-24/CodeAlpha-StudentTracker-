import java.util.ArrayList;
import java.util.Scanner;

public class StudentTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayLists to store student data
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> scores = new ArrayList<>();

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter score: ");
            double score = sc.nextDouble();

            names.add(name);
            scores.add(score);
        }

        // Calculate total
        double total = 0;

        for (double score : scores) {
            total = total + score;
        }

        // Calculate average
        double average = total / n;

        // Find highest and lowest
        double highest = scores.get(0);
        double lowest = scores.get(0);

        for (double score : scores) {

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

        // Display Summary Report
        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student: " + names.get(i) +
                " | Score: " + scores.get(i)
            );
        }

        System.out.println("-------------------------------------------");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);
        System.out.println("===========================================");

        sc.close();
    }
}
