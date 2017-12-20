/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackedQueue;

public class Caller {
    private String name;
    private int id;
    private static int nextid = 0;
    
    public Caller(String name){
        this.name = name; //when param is same name as property
        nextid++;
        id = nextid;
    }
    
    public String toString(){
        return "Caller " + id + "\tName: " + name;
    }
    
}