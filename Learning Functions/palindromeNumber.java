
import java.util.Scanner;

public class palindromeNumber {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Palindrome Number....");
            System.out.print("Please enter your number is: ");
            int num = input.nextInt();
            boolean isPlaindrome = isPalindrome(num);
            if(isPlaindrome){
                System.out.println("Your number is plaindrome number.");
            } else {
                System.out.println("Your number is not plaindrome number.");
            }
        }

    }

    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
        // return num == reverse(num);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
