/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Agent.CuttingMachine;
import Agent.PackingMachine;
import Agent.SewingMachine;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * MachineFactory.java is our main class implemented using factory pattern. 
 * It instantiates a machine agent instance only after determining its type.
 * 
 * @author Group 7
 */
public class MachineFactory {
    
    public static AgentController buildMachine(MachineType model, String id){
        AgentController machine = null;
        try {
            
            Runtime rt = Runtime.instance();
            Profile p = new ProfileImpl();
            p.setParameter(Profile.MAIN, "false");
            AgentContainer c = rt.createMainContainer(p);
            
            switch(model){
                case CUTTING:
                    machine = c.createNewAgent(id,"Agent.CuttingMachine", null);              
                    break;
                case SEWING:
                    machine = c.createNewAgent(id,"Agent.SewingMachine", null);
                    break;
                case PACKING:
                    machine = c.createNewAgent(id,"Agent.PackingMachine", null);
                    break;
                default:
                    //throw exception - a definir ainda.
                    break;
            }
            machine.start(); 
            
        } catch (StaleProxyException ex) {
            Logger.getLogger(MachineFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
       return machine;
    }
    
}
