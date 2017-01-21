
public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//calculateAreaofcirclewithParam(5);
		
		
		// find out the lenght for the string
		String myString = "Kudret";
		String myString2 = "Hairet";

		int lenght = myString.length();
		int lenght2 = myString.length();
		System.out.println("the lenght of mystring1 is : " + lenght);
		System.out.println("the lenght of myString2 is :" + lenght2);

		
		
		
		//find of the index of one character in my String
		int indexofchar1 = myString.indexOf('e');
		int indexofchar2 = myString2.indexOf('H');
		System.out.println("the index e from myString1 is: "+ indexofchar1);
		System.out.println("the index H of the String2 is: "+ indexofchar2);
		
		
		
		//substring
		
		String String1 = "hello my name is kudret.";
		
		String suString1 = String1.substring(0,	17);
		System.out.println("the String between index of 0 and index 7: "+ suString1);
		
		
		
		//equalsignorecase
		String example1 = "kudret";
		String example2 = "KUDREt";
		
		System.out.println(example1.equalsIgnoreCase(example2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void calculateAreaofcirclewithParam(double raduis) {

		double rad = raduis;
		double area = Math.PI * (raduis * raduis);
		System.out.println("the area of the circle is: " + area);
		double circumference = Math.PI * 2 * raduis;
		System.out.println("the circumference of the circle is : " + circumference);

	}

}
