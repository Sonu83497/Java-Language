
import java.util.Scanner;

public class gradeBaseMarks {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter marks: ");
            int marks = input.nextInt();

            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 75) {
                grade = 'B';
            } else if (marks >= 60) {
                grade = 'C';
            } else if (marks >= 33) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("The grade for marks " + marks + " is: " + grade);
        }
    }
}
