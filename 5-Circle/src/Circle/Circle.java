package Circle;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		//  alanı bulan programı yazınız.𝜋 sayısını = 3.14 alınız.Formül : (𝜋 * (r*r) * 𝛼) / 360
double yaricap;
double merkezAci;
double pi= 3.14;

Scanner input = new Scanner(System.in);

System.out.println("Dairenin yariçapini girin: ");
yaricap = input.nextDouble();

System.out.println("Dairenin merkez acisini girin: ");
merkezAci = input.nextDouble();

double alan = (pi * (yaricap*yaricap) * merkezAci) / 360;

System.out.println("Dairenin alani: " + alan);

	}

}
