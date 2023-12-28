/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        //iterate through the pattern of the damka rows 
		for (int i = 0; i < n ; i++) {
			//iterate through the pattern of the damka columns
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0){
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}

		    }
		    System.out.println();

	    }
    }
}    
