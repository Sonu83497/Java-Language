
import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to multiplication world : ");
            System.out.print("Please Enter your number : ");
            int num = input.nextInt();
            printMultiplicationTable(num);
        }

    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
