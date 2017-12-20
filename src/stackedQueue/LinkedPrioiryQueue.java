
package stackedQueue;

import java.util.ArrayList;


public class LinkedPrioiryQueue implements priorityQueue{
    public ArrayList list[];
    
    public LinkedPrioiryQueue(int levels){
        list = new ArrayList[levels];
        for (int i = 0; i < list.length; i++) {
              list[i] = new ArrayList();
        }
    }
    
    
    @Override
    public void enQueue(Object o, int prority) {
        list[prority].add(o);
    }

    @Override
    public Object peekFront() {
       
        for (int i = 0; i < list.length; i++) {
            if(list[i].size() > 0) return list[i].get(0);
        }
        throw new IllegalStateException
				("Queue is empty");
    }
    

    @Override
    public Object dequeue() {
       for (int i = 0; i < list.length; i++) {
            if(list[i].size() > 0) return list[i].remove(0);
        }
        throw new IllegalStateException
				("Queue is empty");
    }

    @Override
    public void enqueue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return list.length;
    }
    
    
    public boolean hasData(){
       
        for (int i = 0; i < list.length; i++) {
            if(list[i].size() > 0) return true;
        }
        return false;
    }
}
