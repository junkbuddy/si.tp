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
    protected void construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
