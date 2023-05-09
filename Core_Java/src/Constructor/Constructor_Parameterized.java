package Constructor;

public class Constructor_Parameterized {

    int id;
    String name;
    String address;

    Constructor_Parameterized() {
        //System.out.println("hello world");
        this(2, "xyz");
        System.out.println("1");

    }

    Constructor_Parameterized(int id, String name) {
        //this is referencing to lcal variable
        this(3, "shivam", "kanpur");
        this.id = id;
        this.name = name;
        System.out.println("2");
    }

    Constructor_Parameterized(int id, String name, String address) {
        //this is referencing
        // if we initialize this(); here then it creats dead lock
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("3");
    }

    public static void main(String[] args) {

        System.out.println("4");

        //Constructor.Constructor_Parameterized c = new Constructor.Constructor_Parameterized(102, "ncdsbhj");

        Constructor_Parameterized c = new Constructor_Parameterized();

        System.out.println("5");

//        c.id = 101;
//        c.name = "vhhjvcsa";

        System.out.println("My id " + c.id);
        System.out.println("My name " + c.name);
        System.out.println("My address " + c.address);
        System.out.println("6");

    }

}
