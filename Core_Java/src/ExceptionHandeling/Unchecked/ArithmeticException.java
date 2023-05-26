package ExceptionHandeling.Unchecked;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = s.nextInt();

        System.out.println("Enter Second number: ");
        int b = s.nextInt();

        int c = 0;
        // Something divide by zero is Arithmetic Exception
        try {
            c = a / b;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("denominator should not be zero !!");
        }

        System.out.println("Division : " + c);
    }
}
