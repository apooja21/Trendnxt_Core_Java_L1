/* Write a program to accept 5 integers passed as arguments while executing the class.
 Find the average of these 5 nos.
 Use ArrayIndexOutofBounds exception to handle
 situation where the user might have entered less than 5 integers.
 */



package exceptionsString;

public class Assignment3 {

	public static void main(String[] args) {
		try {
			float average = 0;
			for(int i=0;i<5;i++)
				average += Integer.parseInt(args[i]);
			System.out.println("Average: "+average/5);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
