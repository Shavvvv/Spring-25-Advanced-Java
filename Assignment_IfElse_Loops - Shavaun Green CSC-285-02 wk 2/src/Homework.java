
/*
 
TASK 1:

Take an integer variable x.
Assign value 3 to it.

Multiply value to 25.
Then Subtract 13.
Add 12.
Divide by 3.

If Quotient value is greater than 5, print "I am the King", else print I lost.
If remainder value is above 2, add 10 into it and print it on the screen.




TASK 2:

Print following using loops

*
***
*****
*******
*********
***********


    *
   ***
  *****
 *******



 */
public class Homework {

	public static void main(String args[]) {

		// Variable x assigned to 3
		int x = 3;

		// Multiply value to 25.
		x *= 25;

		// Then Subtract 13.
		x -= 13;

		// Add 12.
		x += 12;

		// Store a remainder value
		int remainder = x % 3;

		// Divide by 3.

		x /= 3;

		// If Quotient value is greater than 5, print "I am the King", else print I
		// lost.
		// If remainder value is above 2, add 10 into it and print it on the screen.

		if (x > 5) {
			System.out.println("I am the King");
		} else {
			System.out.println("I lost");
		}
		if (remainder > 2) {
			System.out.println(remainder);
		}

		// PATTERNS

		String pattern = "*";
		int size = 10;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(pattern);
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Pyramid Pattern");
		System.out.println();
		int size1 = 10;

		int i, j, k = 10;

		// Loop 1 for each row to be printed
		for (i = 1; i <= size1; i++) {

			// Loop 2 to print each pattern
			for (j = 1; j <= size1; j++) {

				// Condition to print star pattern
				if (j >= k)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			k--;
			System.out.println("");
		}

	}
}
