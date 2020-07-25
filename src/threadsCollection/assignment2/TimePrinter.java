package threadsCollection.assignment2;

import java.util.Date;

public class TimePrinter {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<10;i++) {
			System.out.println(new Date());
			Thread.sleep(2000);
		}

	}

}
