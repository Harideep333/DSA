import java.util.Scanner;

/**
 * @author Harideep Reddy Boothpur
 * @created 2/2/26 3:16 PM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        //Primitive datatypes (which cannot be broken into peices)
        int rollnumber = 55;
        char nameFront = 'B';
        float marks = 87.4f;
        double largeDecimals = 9041241.2414145352;
        long largeIntegers = 12525325252L;


        //Non primitive types
//        System.out.println("Enter a new number: ˳");
//        int first = sc.nextInt();
//        System.out.println(first);

//        String name = sc.nextLine();
//        System.out.println("you entered " + name);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is " + sum);

    }
}