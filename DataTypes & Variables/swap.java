
import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Swapping Station ...\n\n");
            System.out.print("Enter Your first Value A :");
            int firstValue = input.nextInt();
            System.out.print("Enter Your Second Value B :");
        int SecondValue = input.nextInt();
            
            int thirdValue = firstValue;
            firstValue = SecondValue;
            SecondValue = thirdValue;
            System.err.println("\nSwapping Done ...\n\n");
            System.out.println("First value is A :" + firstValue);
        System.out.println("Second value is B :" + SecondValue);
        
        }
}
}
