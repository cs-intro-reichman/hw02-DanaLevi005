/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
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
			    double birth = (Math.random()); // birth < 0.5 represents a boy and birth >=0.5 represents a girl
			    if (birth < 0.5) {
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
