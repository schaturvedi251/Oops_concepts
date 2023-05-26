package ExceptionHandeling;

public class Throw {

    static boolean age(int age) {
        if (age >= 18) {
            System.out.println("Eligible voter : " + age);
        } else {
            try {
                //Custom Throw
                throw new InvalidAgeException("Age should be greater than 18 for eligible voter");
            } catch (InvalidAgeException e) {
                //Predefined
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        age(17);
    }
}
