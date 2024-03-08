package BMI;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// Kilo (kg) / Boy(m) * Boy(m)
double kilo,boy;

Scanner input = new Scanner(System.in);

System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz: ");
boy = input.nextDouble();

System.out.println("Lutfen kilonuzu (kilogram cinsinden) giriniz: ");
kilo = input.nextDouble();

double BMI = kilo/boy*boy;

System.out.println("Vucüt kitle indeksiniz: " + BMI);


		

	}

}
