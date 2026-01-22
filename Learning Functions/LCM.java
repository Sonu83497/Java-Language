
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welocme to LCM....");
            System.out.print("Please Enter Your first number: ");
            int first = input.nextInt();
            System.out.print("Please Enter Your second number: ");
            int second = input.nextInt();
            int lcm = lcm(first, second);
            System.out.println("LCM of the two numbers: " + lcm);
        }

    }

    public static int lcm(int first, int second){
        int i = 1;
        while(i<= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
