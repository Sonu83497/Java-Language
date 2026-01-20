import java.util.Scanner;
public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static int readNumber() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            return number;
        }
    }

    public static void greet() {
        System.out.println("Welcome to Calculator...");

    }

}
