package Inheritance;

public class Inherit_Child extends Inheritance_Parent {
    public static void main(String[] args) {
        Inherit_Child i = new Inherit_Child();
        System.out.println("Subtract value is " + i.sum(7, 4));
        System.out.println("Subtract value is " + i.sub(7, 4));
        System.out.println("Subtract value is " + i.divide(8, 4));
    }
}
