import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome to Sum of Digits ...");
            System.out.print("Please Enter Your Number: ");
            int num = input.nextInt();
            int sum = sumOfDigits(num);
            System.out.println("Sum of Digit : " + sum);

        }
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            // sum += num % 10;
            num /= 10;
        }
        return sum;

    }
    
}
