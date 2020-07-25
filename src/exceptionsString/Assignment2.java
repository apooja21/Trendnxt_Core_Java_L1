package exceptionsString;

public class Assignment2 {
    //Aruguments 1 and 2 should be names followed by marks
	public static void main(String[] args) {
		
		try {
			float avg1 = (Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]))/3;
			float avg2 = (Integer.parseInt(args[5])+Integer.parseInt(args[6])+Integer.parseInt(args[7]))/3;
			System.out.println(args[0]+"'s average: "+avg1);
			System.out.println(args[1]+"'s average: "+avg2);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

	}

}
