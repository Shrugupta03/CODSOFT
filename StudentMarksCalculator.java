import java.util.Scanner;

public class StudentMarksCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Create an array to store the marks
        int[] marks = new int[numberOfSubjects];

        // Get the marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average marks
        float averageMarks = totalMarks / numberOfSubjects;

        // Calculate the grade
        String grade;
        if (averageMarks >= 90) {
            grade = "A+";
        } else if (averageMarks >= 80) {
            grade = "A";
        } else if (averageMarks >= 70) {
            grade = "B";
        } else if (averageMarks >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }

        // Display the results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}

