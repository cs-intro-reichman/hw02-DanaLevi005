/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randomInteger = (int)(Math.random() * 10);  
		int previousInteger = randomInteger;
		System.out.print(randomInteger);

		do {
			randomInteger = (int)(Math.random() * 10);
			if (randomInteger >= previousInteger){
				System.out.print(" " + randomInteger);
				previousInteger = randomInteger;
			}
				
		} while (previousInteger <= randomInteger);

		System.out.println();

	}
}
