package Constructor;

public class Constructor {
    static int x;

    Constructor() {
        System.out.println("First");
    }

    public static void main(String ar[]) {

        System.out.println("Value of x is : " + x);

        Constructor constructor = new Constructor();

    }

}
