public class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");

        //Wait for the threads to end.
        try{
            obj1.mThread.join();
            obj2.mThread.join();
            obj3.mThread.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
