
import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Prime number checker....");
            System.out.print("Enter Your number is: ");
            int num = input.nextInt();
            boolean isPrime = isPrime(num);
            if (isPrime) {
                System.out.println("Your number is prime : ");
            } else {
                System.out.println(" your number is not prime : " );
            }

        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }

        return true;

    }
}
