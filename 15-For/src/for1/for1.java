package for1;
import java.util.Scanner;
public class for1 {

	public static void main(String[] args) {
		
		double number;
		double total = 0;
		int counter=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a nummber: ");
		number = input.nextDouble();
		
		for(int i=0;i<=number;i++ ) {
			if( i%3==0 || i%4==0) {
				total += i;
				counter++;
			} 
		} System.out.println("Total: " + total/counter);
		

	}

}
