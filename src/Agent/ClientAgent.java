/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import jade.core.AID;
import jade.core.Agent;


/**
 *
 * @author user
 */
public class ClientAgent extends Agent{
    
    private String clientName;
    
    private AID manager_AID;

    @Override
    protected void setup() {
        System.out.println("Hallo! Client");
    }
    
    
    
    
    
}
