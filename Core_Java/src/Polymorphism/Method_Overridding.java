package Polymorphism;

public class Method_Overridding extends Method_Overloading {

    @Override
    public int add(int a, int b, int c) {
        return a + b * c;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Method_Overridding m = new Method_Overridding();

        // child class can not be referenced to parent class
//        Method_Overridding o = new Method_Overloading();

        Method_Overloading t = new Method_Overridding();
        Method_Overloading n = new Method_Overloading();


        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 5));
        System.out.println(n.add(2, 3, 5));
//        System.exit(0);
        System.out.println(t.add(2, 5, 6));

    }

}
