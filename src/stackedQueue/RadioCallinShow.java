/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackedQueue;

public class RadioCallinShow {
    
    public static void main(String[] args) {
        LinkedQueue phoneline = new LinkedQueue();
        System.out.println("The lines are open");
        System.out.println("Currently we have " + phoneline.size() + " callers waiting...");
        System.out.println("3 calls are coming in");
        phoneline.enqueue(new Caller("Jim"));
        phoneline.enqueue(new Caller("Amy"));
        phoneline.enqueue(new Caller("Susan"));
        System.out.println("The next caller will be: " + phoneline.peekFront());
        
    }
    
}