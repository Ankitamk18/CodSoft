import java.util.*;

public class student_Grade_calculator {
    public static void main(String args[]) {
        int total_Subjects;
        float total_Marks = 0;
        float average_Marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects: ");
        total_Subjects = sc.nextInt();
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter the marks for subject " + i + ": ");
            totalMarks += sc.nextFloat();
        }
        average_Marks = total_Marks / total_Subjects;
        if (average_Marks >= 80) {
            System.out.println("Total Marks of student: " + total_Marks + ", Average Percentage: " + average_Marks
                    + " and  Grade A");
        } else if (averageMarks >= 60) {
            System.out.println("Total Marks of student: " + total_Marks + ", Average Percentage: " + averageMarks
                    + " and Grade B");
        } else if (averageMarks >= 30) {
            System.out.println(
                    "Total Marks of student: " + totalMarks + ", Average Percentage: " + averageMarks + " and Grade C");
        } else {
            System.out.println(
                    "Total Marks student: " + totalMarks + ", Average Percentage: " + averageMarks + " and Grade D");
        }
    }
}