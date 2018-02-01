import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("What is your first statement? ");
		line = in.nextLine();
		System.out.println("You said: " + line);

		System.out.print("What is your second statement? ");
		line = in.nextLine();
		System.out.println("You also said: " + line);
	}
}