package principal;

public class Synch2 {

    public static void main(String args[]) {
        CallMe2 target = new CallMe2();
        
        Caller2 obj1 = new Caller2(target, "Hello");
        Caller2 obj2 = new Caller2(target, "Synchronized");
        Caller2 obj3 = new Caller2(target, "World");

//        wait for threads to end
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interruped");
        }
    }
}
