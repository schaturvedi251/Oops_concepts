

public class Object {
    public static void main(String a[]) {
        Object obj = new Object();
        System.out.println(obj.sub(8, 3));
        System.out.println(obj.sum(4, 50));



    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
