/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import Factory.Machine;
import Factory.MachineType;

/**
 *
 * SewingMachine.java is concrete implementation of machine type SEWING
 * 
 * @author Group 7
 */
public class SewingMachine extends Machine{
    
    public SewingMachine (){
        super(MachineType.SEWING);
        construct();
    }

    @Override
    protected void setup() {
        System.out.println("Hello World. My name is " + this.getLocalName());
    }

    
    
    @Override
    protected void construct() {
         System.out.println("Sewing");
    }
    
}
