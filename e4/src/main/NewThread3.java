/**
 * Created by rober on 1/27/2016.
 */
public class NewThread3 implements Runnable{

    public String name;
    public Thread t;

    public NewThread3(String threadname){
        name = threadname;
        t=new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    //This is the entry point for thread.
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}
