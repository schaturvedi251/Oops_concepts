package Polymorphism;

public class Method_Overloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {

        Method_Overloading m = new Method_Overloading();

        System.out.println(m.add(11, 11));
        System.out.println(m.add(11, 11, 11));

    }

}
