/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int sum = 1;
		String isPerfect = number + " is a perfect number since " + number + " = 1";
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPerfect += (" + " + i);
				sum += i;
			}	
		}
		   
		if (number == sum) {
			System.out.println(isPerfect);
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}	
}	


