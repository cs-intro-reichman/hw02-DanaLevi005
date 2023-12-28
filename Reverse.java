/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reverseWord = "";
		int middleChar = (word.length() - 1) / 2;
		int i = word.length() - 1;

		while (i >= 0) {
			reverseWord += word.charAt(i);
			i--;
		}

		System.out.println(reverseWord);
		System.out.println("The middle character is " + word.charAt(middleChar));
	}
}
