
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Armstrong Number...");
            System.out.print("Please Enter Your number is : ");
            int num = input.nextInt();
            boolean isArmstrong = isArmstrong(num);
            System.out.println("isArmstrong number is: "+ isArmstrong);
            if (isArmstrong) {
                System.out.println("Your number is Armstorng.");
            } else {
                System.out.println("Your number is not Armstrong.");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int NoOfDigits = NoOfDigits(num);
        int numCopy = num;
        System.out.println("Number of Digits : " + NoOfDigits);
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, NoOfDigits);
        }
        System.out.println("Final Number is :" + finalNumber);
        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        System.out.println("Power of "+ num1 + " is : "+result);
        return result;
    }

    public static int NoOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
