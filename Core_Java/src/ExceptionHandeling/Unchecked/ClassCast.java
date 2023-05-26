package ExceptionHandeling.Unchecked;

public class ClassCast {
    public static void main(String[] args) {
        Object obj = new Integer(10);

        String str = (String) obj; // Attempting to cast an Integer to a String
        System.out.println("String: " + str);


//        try {
//            Object obj = new Integer(10);
//            String str = (String) obj; // Attempting to cast an Integer to a String
//            System.out.println("String: " + str);
//        } catch (ClassCastException e) {
//            System.out.println("Class cast exception occurred: " + e.getMessage());
//        }
    }
}
