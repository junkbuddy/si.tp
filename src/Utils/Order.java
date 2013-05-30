package Utils;

import jade.core.AID;

/**
 *
 * @author lpc
 */
public class Order {
    
    public enum STATUS {
        WAITING, PRODUCTION, FINISHED
    };
    
    private AID clientAID;
    private String orderID;
    private int quantity;
    private int processedQuantity;
    private long entryTimestamp;
    private long deliveryTimestamp;
    private STATUS status;
    
    
    
}