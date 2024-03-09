package Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number One: ");
		n1 = input.nextInt();
		System.out.println("Enter Number Two: ");
		n2 = input.nextInt();
		
		System.out.println("Select the operation: \n1:+\n2:-\n3:*\n4:/");
		select = input.nextInt();
		
		switch (select) {
		
		case 1: System.out.println("Answer is: " + (n1 + n2));
		break;
		
		case 2: System.out.println("Answer is: " + (n1 - n2));
		break;
		
		case 3: System.out.println("Answer is: " + n1 * n2);
		break;
		
		case 4: System.out.println("Answer is: " + n1 / n2);
		break;
		
		}
		

	}

}
