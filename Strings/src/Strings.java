
public class Strings {
	public static void main (String args[]) {
		
		
		String input = "This course thoroughly examines many of the sophisticated features of the Java programming language, including the interfaces, "
				+ "advanced JavaFX graphics, string manipulation,  exception handling, some data structures, "
				+ "file I/O techniques, multithreading, generics, string formatters  and the wrappers. Students demonstrate "
				+ "their mastery of the material  through a series of graded projects and assignments that challenge at an "
				+ "extremely high level. Important Note: Eclipse IDE will be used to demonstrate the examples, sample programs and "
				+ "for submission of assignments. Please install the Eclipse IDE for Java Developers on your systems. "
				+ "Link is given below.";

		

	/*Take input string (given above) as an input.

	1. Print the count, how many times the word "the" come in this string.
	2. Replace word "the" to uppercase "THE" in the string and print it.
	3. Find and print last occurrence index of term "Java".
	4. How many sentences this string contains?
	5. Does this string contains term "eclipse" (case Insensitive)?
		
		
	*/	
		
		// 1. Print the count, how many times the word "the" come in this string. 
		
		// Word counter
		int count =0;
		
		// Word we are looking for
		String word = "the";
		
		// Save each word into an array
		String arr[]=input.split(" ");
		
			for(int i=0;i<arr.length;i++) {
				if (word.equals(arr[i])) {
					count++;
				}
			
			}
			System.out.println("\"the\" occurs " + count + " times in the String.");
		
			
		System.out.println();
		
		
				//2. Replace word "the" to uppercase "THE" in the string and print it.
		
		// Declare empty String to print to console later
	String output="";
		
	// Increment through array to adjust target word to change to uppercase
		for (int i=0;i<arr.length;i++) {
			if (word.equals(arr[i])) {
				arr[i]=arr[i].toUpperCase();
				}
			
			// Add word to output
				output += arr[i];
				
			//	add spaces between words
			if(!(i==arr.length-1)) {
				output +=" ";
			}
				
		}
		
		System.out.println(output);

		
	}
}
