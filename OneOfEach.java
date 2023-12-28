
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isBoy = false;
		boolean isGirl = false;
		boolean baby = true;
		int sum = 0;


		while (baby != (isGirl && isBoy)) {
			int birth = (int)(Math.random() * 2); // 0 represents a boy and 1 represents a girl
			if (birth == 0) {
				isBoy = true;
				System.out.print("b ");

			} else {
				isGirl = true;
				System.out.print("g ");
			}
			sum++;
		}
		System.out.println();
		System.out.println("You made it... and you have " + sum + " children.");
	}
}
