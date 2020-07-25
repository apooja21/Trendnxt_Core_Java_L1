package threadsCollection.assignment1;

public class Number implements Runnable {
	
    private int number;
	
	public Number(int number) {
		this.number = number;
	}
	
	synchronized public void run() {
		System.out.println("Number : "+number);
	}

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			int r = (int)(Math.random()*10);
			Runnable num = new Number(r);
			new Thread(num).start();
			Runnable fact = new Factorial(r);
			new Thread(fact).start();
		}

	}

}
