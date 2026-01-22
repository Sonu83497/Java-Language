
public class parameter {

    public static void main(String[] args) {
        int num = sumTwoNumbers(4, 7);
        System.out.println(num);
        System.out.println(sumTwoNumbers(4, 7));
    }

    public static int sumTwoNumbers(int first, int second) {
        System.out.println("Frist number is received : " + first);
        System.out.println("Second number is received : " + second);
        int sum = first + second;
        return sum;
        
    }
}
