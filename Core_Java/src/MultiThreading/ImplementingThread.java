package MultiThreading;

public class ImplementingThread implements Runnable
{
    public static void main(String[] args)
    {
        ImplementingThread t1 = new ImplementingThread();

        Thread t = new Thread(t1);

        ClassThread t2 = new ClassThread();

        t2.start();
        t.start();
    }

    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Value Thread1 : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
