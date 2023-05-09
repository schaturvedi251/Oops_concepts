//import Polymorphism.Method_Overridding;-


public class Encapsulation extends Polymorphism.Method_Overridding {

    public static void main(String[] args) {

        // Here package polymorphism used
        Polymorphism.Method_Overridding m = new Polymorphism.Method_Overridding();

        //sub can not be called because it is private method and accessible only the same class.
        //System.out.println(m.sub());

        // Here add method is using outside the package(polymorphism) so add method is need to be public.
        System.out.println(m.add(2, 3, 5));

    }
}
