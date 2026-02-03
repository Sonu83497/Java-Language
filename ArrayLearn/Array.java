
public class Array {

    public static void main(String[] args) {
        // int[] myArr = new int[5];
        // myArr[0] = 95;
        // myArr[1] = 94;
        // myArr[4] = 99;
        // myArr[3] = 905;
        // myArr[2] = 9;
        int[] myArr = {95, 94, 9, 905, 99};
        // int index = 2;
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[0]);
        System.out.println(myArr[4]);
        System.out.println(myArr[1]);
        // Array Traversal
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }


        String[] strArr = new String[4];
        strArr[0] = "Hello";
        strArr[1] = "World";
        strArr[2] = "Java";
        strArr[3] = "Programming";
        int i = 0;
        while(i < strArr.length){
            System.out.println(strArr[i]);
            i++;
        }

        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        System.out.println("Fruits List : "+ fruits.length);
    }

}
