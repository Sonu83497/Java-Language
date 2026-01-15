
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Swapping Station ...\n\n");
            System.out.print("Enter Your first Value A :");
            int num1 = input.nextInt();
            System.out.print("Enter Your Second Value B :");
            int num2 = input.nextInt();

            int Sum = num1 + num2;
            System.out.println("Addition is :" + Sum);

            int Sub = num1 - num2;
            System.out.println("Subtraction is :" + Sub);

            int multi = num1 * num2;
            System.out.println("Multiple is :" + multi);

            float divide = num1 / num2;
            System.out.println("Division is :" + divide);

            int mod = num1 % num2;
            System.out.println("Modulus is :" + mod);

        }
    }
}
