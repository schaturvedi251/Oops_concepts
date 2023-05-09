package Abstraction;

public interface Shape {

    // here every variable that initialize are public static final
    public static final int i = 74;

    // here every method that initialize are public abstract
    public abstract void call(int r);

}

class circle implements Shape {

    public void call(int r) {
        System.out.println("Area of circle is " + (Math.PI * r * r));
    }

    public static void main(String[] args) {
        Shape s1 = new circle();
        s1.call(2);
    }

}
