/*Write an interface called Playable, with a method void play();
 *Let this interface be placed in a package called music.
 *Write a class called Veena which implements Playable interface. 
 *Let this class be placed in a package music.string.
 *Write a class called Saxophone which implements Playable interface. 
 *Let this class be placed in a package music.wind.
 *Write another class Test in a package called live. Then,
 *a. Create an instance of Veena and call play() method
 *b. Create an instance of Saxophone and call play() method
 *c. Place the above instances in a variable of type Playable and then call play().
*/


package objectOriented.live;

import objectOriented.assignment6.music.Playable;
import objectOriented.assignment6.music.string.Veena;
import objectOriented.assignment6.music.wind.Saxophone;


public class Test {

	public static void main(String[] args) {
		Playable p_veena, p_saxophone;
		p_veena = new Veena();
		p_saxophone = new Saxophone();
		
		p_veena.play();
		p_saxophone.play();
		System.out.println("------------");
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		
		v.play();
		s.play();

	}

}
