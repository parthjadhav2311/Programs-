package InterThreadCommunication;

class Consumer implements Runnable {
	private SharedResource sharedResource;
	
	public Consumer (SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
		int consumedItem = sharedResource.consume();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		   }
		
		}
	}
}