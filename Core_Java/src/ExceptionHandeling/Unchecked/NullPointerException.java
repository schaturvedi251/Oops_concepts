package ExceptionHandeling.Unchecked;

public class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // Attempting to access a method of a null object

        System.out.println("Length: " + length);


//        try {
//            String str = null;
//            int length = str.length(); // Attempting to access a method of a null object
//            System.out.println("Length: " + length);
//        } catch (NullPointerException e) {
//            System.out.println("Null pointer exception occurred: " + e.getMessage());
//        }

    }
}
