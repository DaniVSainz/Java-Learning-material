import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//create scanner object 
		Scanner input = new Scanner(System.in); 
		// output the prompt
		System.out.println("Enter a line of text");
		//wait for user to enter the line of text
		int value = input.nextInt();
		//Tell them what they entered
		System.out.println("You entered: "+ value);
	}

}
