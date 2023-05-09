package Abstraction;

abstract public class Abstract_Class {

    public void call() {
        System.out.println("call method");
    }

    abstract public void abstractMethod();

    public static void main(String[] args) {

        Abstract_Class ab = new Abstract_Child_class();

        ab.call();
        ab.abstractMethod();
    }

}
