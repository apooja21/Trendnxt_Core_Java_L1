 package objectOriented.assignment5;

public class InstrumentMain {

	public static void main(String[] args) {
		Instrument[] ref = new Instrument[10];
		ref[0] = new Piano();
		ref[0].play();
		
		ref[1] = new Flute();
		ref[1].play();
		
		ref[5] = new Guitar();
		ref[5].play();

	}

}
