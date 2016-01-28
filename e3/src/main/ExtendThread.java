/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author a13116349
 */
public class ExtendThread {

    public static void main(String[] args) {
        new NewThread2(); //Create a new thread
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
