
import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Fibonacci Series...");
            System.out.print("Please Enter Your number is : ");
            int num = input.nextInt();
            System.out.println("Fibonacci Series is : ");
            fibonacci(num);
        }
    }

    public static void fibonacci(int num) {
        if (num < 0) {
            return;
        }
        System.out.print("0 ");
        if (num == 0) {
            return;
        }
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }
    }

}
