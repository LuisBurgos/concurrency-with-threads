public class Synch2 {
    public static void main(String args[]) {
        CallMe2 target = new CallMe2();
        int times = 100;
        while (times-- > 0) {
            Caller2 obj1 = new Caller2(target, "Hello");
            Caller2 obj2 = new Caller2(target, "Synchronized");
            Caller2 obj3 = new Caller2(target, "World");
        }
    }
}
