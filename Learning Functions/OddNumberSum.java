import java.util.Scanner;
public class OddNumberSum {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome To Odd Sum ...");
            System.out.print("Please Enter Your Number : ");
            int num = input.nextInt();
            int sum = oddSum(num);
            System.out.println("oddSum till " + num + " is : " + sum);
        }
    }
    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum = sum + i;
            i += 2;
        }
        return sum; 
        
    }
}
