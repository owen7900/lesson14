
package stackedQueue;


public class Tire {
    
    int id;
    String  make;
    static int nextId = 0;
    public Tire(String make){
        this.make = make;
        nextId++;
        id = nextId;
    }

    @Override
    public String toString() {
        return "id: " + id +"\tmake: " + make;
    }
    
    
    
}
