/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Factory.MachineFactory;
import Factory.MachineType;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Test Class
 * 
 * @author Group 7
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgentController buildMachine = MachineFactory.buildMachine(MachineType.SEWING, "sewing");
         AgentController buildMachine2 = MachineFactory.buildMachine(MachineType.CUTTING, "cutting");
         AgentController buildMachine3 = MachineFactory.buildMachine(MachineType.PACKING, "packing");
        
        try {
            buildMachine.start();
            buildMachine2.start();
            buildMachine3.start();
        } catch (StaleProxyException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
