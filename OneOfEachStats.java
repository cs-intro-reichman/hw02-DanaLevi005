import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		int totalSum = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourChildrenOrMore = 0;

		for (int i = 0; i < T; i++) {
			boolean isBoy = false;
		    boolean isGirl = false;
		    boolean baby = true;
		    int sum = 0;

		    while (baby != (isGirl && isBoy)) {
			    int birth = (int)(generator.nextDouble() * 2); // 0 represents a boy and 1 represents a girl
			    if (birth == 0) {
				isBoy = true;
				System.out.print("b ");

			    } else {
				isGirl = true;
				System.out.print("g ");
			    }
			    sum++;
		    }
		    switch (sum) {
		        case 2: twoChildren++;
		        	    break;
		        case 3: threeChildren++;
		                break;
		        default: fourChildrenOrMore++;
		                break;        	
		    }

		    System.out.println();
		    System.out.println("You made it... and you have " + sum + " children.");
		    totalSum += sum;
		}
        double average = (double) totalSum / T;

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourChildrenOrMore);

        if ((twoChildren >= threeChildren) && (twoChildren >= fourChildrenOrMore)) {
        	System.out.println("The most common number of children is 2.");

        } else if ((threeChildren >= twoChildren) && (threeChildren >= fourChildrenOrMore)) {
        	System.out.println("The most common number of children is 3.");

        } else {
        	System.out.println("The most common number of children is 4 or more.");

        }


	}		
		

}

