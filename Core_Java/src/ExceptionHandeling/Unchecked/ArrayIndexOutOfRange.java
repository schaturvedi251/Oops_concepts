package ExceptionHandeling.Unchecked;

public class ArrayIndexOutOfRange {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int element = array[3]; // Accessing an element with an index that is out of bounds
        System.out.println("Element: " + element);

//        try {
//            int element = array[23]; // Accessing an element with an index that is out of bounds
//            System.out.println("Element: " + element);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        }

    }

}
