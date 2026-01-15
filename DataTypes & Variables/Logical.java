import java.util.Scanner;
public class Logical{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount Calculator :");
        System.out.print("Please Enter your age : ");
        int age = input.nextInt();
        System.out.print("Are You female? (True/false) : ");
        boolean isFemale = input.nextBoolean();
        if (age>5){
            System.out.println("You got 75% discount on your ticket");
        }else if(isFemale){
            System.out.println("You got 50% discount on your ticket");
        }else if(age>60 && !isFemale){
            System.out.println("You got 25% discount on your ticket");
        }else{
            System.out.println("Sorry! No discount for you");
        }
        input.close();
    }

}