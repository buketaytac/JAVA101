package Greengrocer;
import java.util.Scanner;

public class Greengrocer {

	public static void main(String[] args) {
		
		double armut= 2.14;
		double elma= 1.11;
		double muz=0.95;
		double patlican=5.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut kac kilo?: ");
		armut = input.nextDouble();
		
		System.out.println("Elma kac kilo?: ");
		elma = input.nextDouble();
		
		System.out.println("Muz kac kilo?: ");
		muz = input.nextDouble();
		
		System.out.println("Patlican kac kilo?: ");
		patlican= input.nextDouble();
		
		double hesap = armut * 2.14 + elma * 1.11 + muz * 0.95 + patlican * 5.0;
		
		System.out.println("Toplam hesap: " + hesap);
		

	}

}
