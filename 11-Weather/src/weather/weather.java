package weather;
import java.util.Scanner;
public class weather {

	public static void main(String[] args) {
		
		int temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in celcius: ");
		temp = input.nextInt();
		if ( temp < 5 ) 
		{
			System.out.println("Ski");	
			
		} if ( temp > 5 && temp < 15) 
		{
			System.out.println("Cinema");
			
		} if ( temp > 15 && temp < 25  ) 
		{
			System.out.println("Picnic");	
			
		} if ( temp > 25 ) 
		{
			System.out.println("Swimming");	
		}
		
		
	}
}
