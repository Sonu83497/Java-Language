
import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {
       try( Scanner input = new Scanner(System.in)){
        System.out.println("Welcome to driving Licence Portal :");
        System.out.print("Please Enter Your age : ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive !");
        } else {
            System.out.println("You are not fit for drive.");
        }
        input.close();
    }
}
}