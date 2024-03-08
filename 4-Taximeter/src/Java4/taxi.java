package Java4;
import java.util.Scanner;
public class taxi {

	public static void main(String[] args) {
		// km başına 22.20 tl açılış ücreti 10 eğer toplam tutar 20den azsa 20 ödenecek
		Scanner input = new Scanner(System.in);
		
		double mesafe;
		System.out.println("Gidilecek kilometreyi girin: ");
		
		mesafe = input.nextDouble();
		
		double ucret = 10 + mesafe * 22.20;
		
		double durum = ucret < 20 ? ucret = 20 : ucret;
		
		System.out.println("Ödenecek tutar: " + durum);
		

	}

}
