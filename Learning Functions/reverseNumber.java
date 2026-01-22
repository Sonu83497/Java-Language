
import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome to Reverse the Digits....");
            System.out.print("Please enter your number is: ");
            int num = input.nextInt();
            int reverse = reverse(num);
            System.out.println("Your Reverse number is : " + reverse);
        }

    }
    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
     

    