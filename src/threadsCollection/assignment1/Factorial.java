package threadsCollection.assignment1;

public class Factorial implements Runnable {
	
private int n;
	
	public Factorial(int n) {
		this.n = n;
	}
	
	synchronized public void run() {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+" : "+fact);
	}

}
