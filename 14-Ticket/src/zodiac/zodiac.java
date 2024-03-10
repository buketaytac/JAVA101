package zodiac;
import java.util.Scanner;

public class zodiac {
	
	public static void main(String[] args) {
		
		int yolculukTipi;
		int km;
		int yas;
		double indirimliTutar;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Yolculuk tipini giriniz (1-> Tek yon 2->Gidis-Donus): ");
		yolculukTipi = input.nextInt();
		
		System.out.println("Mesafeyi km cinsinden giriniz ");
		km = input.nextInt();
		
		double normalTutar = km * 0.10;
		
		System.out.println("Yasinizi giriniz ");
		yas = input.nextInt();
		
		

		if ( km < 0 || yas < 0 || yolculukTipi > 2 || yolculukTipi < 0 ) { 
			
			System.out.println("Hatali bilgi girdiniz.");
			
		} else if (yolculukTipi == 2) {
			indirimliTutar = normalTutar * 80 / 100;
				if (yas<12) {
					indirimliTutar = indirimliTutar * 50/100;
					System.out.println("Toplam Tutar: " + indirimliTutar);}
				if (yas>12 && yas<24) {
					indirimliTutar = indirimliTutar * 90/100;
					System.out.println("Toplam Tutar: " + indirimliTutar);} 
				if (yas>65) {
					indirimliTutar = indirimliTutar * 70/100;
					System.out.println("Toplam Tutar: " + indirimliTutar);}
		} else if (yas<12) {
			indirimliTutar = normalTutar * 50/100;
			System.out.println("Toplam Tutar: " + indirimliTutar);} 
		  else if (yas>12 && yas<24) {
			indirimliTutar = normalTutar * 90/100;
			System.out.println("Toplam Tutar: " + indirimliTutar);}
		  else if (yas>65) {
			indirimliTutar = normalTutar * 70/100;
			System.out.println("Toplam Tutar: " + indirimliTutar);}
		else {
			System.out.println("Toplam Tutar: " + normalTutar);
		}
	}

}
