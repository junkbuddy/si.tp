/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import Factory.MachineType;
import Factory.Machine;

/**
 *
 * CuttingMachine.java is concrete implementation of machine type CUTTING
 * 
 * @author Group 7
 */
public class CuttingMachine extends Machine{

    public CuttingMachine() {
        super(MachineType.CUTTING);
        construct();
    }
    
    
    @Override
    protected void construct() {
        System.out.println("costura");
    }
    
}
