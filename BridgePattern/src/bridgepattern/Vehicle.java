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
abstract class Vehicle {
        protected Workshop w1; 
    protected Workshop w2; 
      
    protected Vehicle(Workshop w1, Workshop w2) 
        { 
            this.w1 = w1; 
            this.w2 = w2; 
        } 
      
    abstract public void manufacture(); 
}
