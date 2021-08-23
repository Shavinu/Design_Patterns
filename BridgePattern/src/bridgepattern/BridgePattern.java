package bridgepattern;
/**
 *
 * @author Shavinu
 */
public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Vehicle vehicle1 = new Car(new Produce(), new Assemble()); 
     vehicle1.manufacture(); 
     Vehicle vehicle2 = new Bike(new Produce(), new Assemble()); 
     vehicle2.manufacture();
    }
    
}
