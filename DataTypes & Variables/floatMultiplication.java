
import java.util.Scanner;

public class floatMultiplication {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Swapping Station ...\n\n");
            System.out.print("Enter Your first Value A :");
            double num1 = input.nextDouble();
            System.out.print("Enter Your Second Value B :");
            double num2 = input.nextDouble();

            double multi = num1 * num2;
            System.out.println("\nResult is : " + multi);
        }
    }

}
