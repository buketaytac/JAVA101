package java1;
import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
		double kenar1,kenar2,kenar3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Kenarın Uzunluğunu Girin: ");
		kenar1 = input.nextDouble();
		
		System.out.print("2. Kenarın Uzunluğunu Girin: ");
		kenar2 = input.nextDouble();
		
		System.out.print("3. Kenarın Uzunluğunu Girin: ");
		kenar3 = input.nextDouble();
		
		double u = ( kenar1 + kenar2 + kenar3 ) / 2;
		
		double alan = Math.sqrt(  u * (u - kenar1) * (u - kenar2) * (u - kenar3));
		
		System.out.println("Ücgenin alani: " + alan);
		
		

	}

}
