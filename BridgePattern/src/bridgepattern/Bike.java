/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

/**
 *
 * @author Shavinu
 */
public class Bike extends Vehicle{
    public Bike(Workshop w1, Workshop w2) 
 { 
     super(w1, w2); 
 } 
 @Override public void manufacture() 
 { 
     System.out.print("Bike "); 
     w1.work(); 
     w2.work(); 
 } 
}
