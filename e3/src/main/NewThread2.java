/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a13116349
 */
public class NewThread2 extends Thread {
    NewThread2() {
        //Create a ner, second thread
        super("Demo Thread");
//        this.setPriority(10);
        System.out.println("Chlid thread: " + this);
        start(); // Star the thread
    }
    //This is the entry point for the second thread

    public void run() {
        try {

            for (int i = 10; i > 0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child");
    }
}
