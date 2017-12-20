
package stackedQueue;


public class ERTester {

    
    public static void main(String[] args) {
       LinkedPrioiryQueue ER = new LinkedPrioiryQueue(3);
       ER.enQueue("Sam", 2);
       ER.enQueue("Bob", 1);
       ER.enQueue("Joe", 0);
       ER.enQueue("Amy", 1);
       
        System.out.println("Treating " + ER.dequeue());
        System.out.println("Treating " + ER.dequeue());
        System.out.println("Treating " + ER.dequeue());
        System.out.println("Treating " + ER.dequeue());
    }
    
}
