package for2;
import java.util.Scanner;
public class for2 {

	public static void main(String[] args) {
		// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri 
//		kabul eden ve girilen 
//		değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
		int number=0;
		int total=0;
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Enter a number: ");
		number = input.nextInt();
			if(number%4==0) {
			
			total+= number;
			}
		
		}	while (number%2==0);
		
		System.out.println("Total: " + total);
		
		
	}

}
