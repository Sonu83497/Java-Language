
import java.util.Scanner;

public class categorizeApersonDifferentAge {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the age of the person: ");
            int age = input.nextInt();

            if (age < 13) {
                System.out.println("The person is a Child.");
            } else if (age >= 13 && age < 20) {
                System.out.println("The person is a Teenager.");
            } else if (age >= 20 && age < 60) {
                System.out.println("The person is an Adult.");
            } else {
                System.out.println("The person is a Senior Citizen.");
            }
        }
    }
}
