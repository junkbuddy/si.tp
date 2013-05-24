/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import jade.core.Agent;



/**
 *
 * 
 * Machine.java is parent class of all machine instances and it 
 * will also contain the common logic applicable in machine making of all types.
 * 
 * 
 * @author Group 7
 */
public abstract class Machine extends Agent{
    
    private MachineType model = null;

    public Machine(MachineType model) {
      this.model = model;
    }
    
    protected abstract void construct();
    
    public MachineType getModel(){
        return this.model;
    }
    
    public void setModel(MachineType model){
        this.model = model;
    }
    
    
    
}
