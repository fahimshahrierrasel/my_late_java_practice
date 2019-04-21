import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.print("Hello World\nWhat is your name?\n>");
		String name = input.nextLine();
		
		System.out.println(String.format("Hello %s, Welcome to Java World.\nHere is a loop for you.", name));
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

	}
}
