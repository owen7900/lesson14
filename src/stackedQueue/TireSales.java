
package stackedQueue;


public class TireSales {

    
    public static void main(String[] args) {
        ArrayStack pole = new ArrayStack();
        Tire t;
        System.out.println("adding 10 goodyears to the pole");
        
        for (int i = 0; i < 10; i++) {
            t = new Tire("GoodYear");
            pole.push(t);
        }
        System.out.println("selling 4 tires to a");
        for (int i = 0; i < 4; i++) {
            System.out.println(pole.pop().toString());
        }
        
        System.out.println("adding 2 new cooper tires");
        for (int i = 0; i < 2; i++) {
            t = new Tire("Cooper");
            pole.push(t);
        }
        
        System.out.println("selling 4 tires to a");
        for (int i = 0; i < 4; i++) {
            System.out.println(pole.pop().toString());
        }
        System.out.println("next tire is " + pole.peekTop());
        System.out.println("Number of tires left is " + pole.size());
        
    }
    
}
