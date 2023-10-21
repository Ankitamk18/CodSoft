import java.util.*;

public class student_Grade_calculator {
    public static void main(String args[]) {
        float totalSubjects, totalMarks = 0, averageMarks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of subjects: ");
        totalSubjects = scanner.nextFloat();
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter the marks for subject " + i + ": ");
            totalMarks += scanner.nextFloat();
        }
        averageMarks = totalMarks / totalSubjects;
        if (averageMarks >= 80) {
            System.out.println("Total Marks: " + totalMarks + ", Average Percentage: " + averageMarks + ", Grade A");
        } else if (averageMarks >= 60) {
            System.out.println("Total Marks: " + totalMarks + ", Average Percentage: " + averageMarks + ", Grade B");
        } else if (averageMarks >= 30) {
            System.out.println("Total Marks: " + totalMarks + ", Average Percentage: " + averageMarks + ", Grade C");
        } else {
            System.out.println("Total Marks: " + totalMarks + ", Average Percentage: " + averageMarks + ", Grade D");
        }
    }
}