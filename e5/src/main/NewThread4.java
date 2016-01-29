public class NewThread4 implements Runnable {

    public String name;
    public Thread t;

    public NewThread4(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();

    }

    //This is the entry point for thread.
    public void run(){
        try{
          for (int i = 5; i > 0; i--) {
              System.out.println(name + ": " + i);
              Thread.sleep(1000);
          }
        } catch (InterruptedException e){
          System.out.println(name + "interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
