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
        super.setup(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    @Override
    protected void construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
