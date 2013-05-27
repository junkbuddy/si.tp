/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import Factory.Machine;
import Factory.MachineType;

/**
 *
 * PackingMachine.java is concrete implementation of machine type PACKING
 * 
 * @author JLuisCosta
 */
public class PackingMachine extends Machine{

    public PackingMachine() {
        super(MachineType.PACKING);
        construct();
    }

    @Override
    protected void setup() {
        System.out.println("Hello World. My name is " + this.getLocalName());
    }

    
    
    
    @Override
    protected void construct() {
         System.out.println("Packing");
    }
    
}
