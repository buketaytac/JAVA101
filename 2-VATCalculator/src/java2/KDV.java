package java1;
import java.util.Scanner;

public class KDV {

	public static void main(String[] args) {
		// KDV tutarı %18 alındı
		
		float para;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Para miktarını giriniz: ");
		para = input.nextFloat();
		
		float kdvliTutar = para * 8 / 100 + para;
		
		var durum = para > 1000.0 ? kdvliTutar = para * 18 / 100 + para : kdvliTutar;
		
		System.out.println("KDVli tutar: " + kdvliTutar);

		
		
		
	}

}
