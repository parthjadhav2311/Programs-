package InterThreadCommunication;

public class SharedResource {
    private int item;
    private boolean newItem = false;
    
    synchronized void produce (int newItem) {
    	while (this.newItem) {
    		try {
    			wait();
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }
     
    this.item = newItem;
    System.out.println("Produced: " + newItem);
    this.newItem = true;
    notify();
 }
    
    synchronized int consume() {
    	while (!this.newItem) {
    	try {	
    		wait();
         } catch (InterruptedException e) {
        	 e.printStackTrace();
        	 
         }
      }
    	
    	int consumedItem = this.item;
    	System.out.println("Consumed: " + consumedItem);
    	this.newItem = false;
    	notify();
    	return consumedItem;
    }

	
}
