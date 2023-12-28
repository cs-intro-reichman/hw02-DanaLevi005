/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        //iterate through the pattern of the damka rows 
		for (int i = 0; i < n / 2; i++) {
			//iterate through the pattern of the damka columns
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
			for (int k = 0; k < n; k++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
