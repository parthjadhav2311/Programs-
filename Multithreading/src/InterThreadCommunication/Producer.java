package InterThreadCommunication;

public class Producer implements Runnable{
    private SharedResource sharedResource;
    
    public Producer(SharedResource sharedResoure) {
    	this.sharedResource = sharedResource;
    }
    
    public void run() {
    	for (int i = 1; i<=5; i++) {
    		sharedResource.produce(i);
    		try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
}
