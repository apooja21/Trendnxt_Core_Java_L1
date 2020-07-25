package exceptionsString;

public class Assignment1 {

 public static void main(String[] args) throws Exception {
	try {
		int age = Integer.parseInt(args[1]);
		
		if(age>=18 && age<60)
			System.out.println("Looks good");
		else
			throw new InvalidAgeException("Age is not acceptable");
		}
		catch(InvalidAgeException e){
			System.out.println(e);			
		}
	    catch(Exception e) {
	    	System.out.println(e);
	    }

	}

}
