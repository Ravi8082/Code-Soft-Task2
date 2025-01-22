package Task2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator!");
        System.out.println("Enter The Number Of Subject");
        int numberOfSubject = sc.nextInt();
        int marks[] = new int[numberOfSubject];
        int totalMark =0;
        for (int i = 0; i < numberOfSubject; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println(" Invalid Marks' please Enter the Value of Marks 0 To 100");
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            }
            totalMark += marks[i];
        }
        System.out.println("\nTotal Marks Obtained: " + totalMark);

        // Calculate Average Percentage
        double averagePercentage = (double) totalMark/ numberOfSubject;
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        // Grade Calculation
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Grade
        System.out.println("Grade: " + grade);
    }
}
