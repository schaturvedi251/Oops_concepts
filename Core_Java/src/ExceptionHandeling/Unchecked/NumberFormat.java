package ExceptionHandeling.Unchecked;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numberString = scanner.nextLine();

        Integer number = Integer.parseInt(numberString);
        System.out.println("Number: " + number);


//        try {
//            System.out.print("Enter a number: ");
//            String numberString = scanner.nextLine();
//
//            int number = Integer.parseInt(numberString);
//            System.out.println("Number: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid number format: " + e.getMessage());
//        }
    }
}
