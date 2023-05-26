package MultiThreading;

public class ThreadOp
{
    public static void main(String[] args) {
        System.out.println("Program Started ...");

        int a = 45+123;
        System.out.println("Sum "+a);

        Thread t = Thread.currentThread();
//        String tname = t.getName();
        System.out.println("Current Thread name : "+t.getName());

        t.setName("MyMain");
        System.out.println("Current Thread name by set method: "+t.getName());

        try {
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println(t.getId());

        USerDefineThread t1 = new USerDefineThread();
        t1.start();

        System.out.println("Program Terminated ...");
    }
}
class USerDefineThread extends Thread{
    public void run()
    {
        System.out.println("THis is USer Define Thread");
    }
}
