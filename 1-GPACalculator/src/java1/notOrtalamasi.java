package java1;
import java.util.Scanner;

public class notOrtalamasi {

	public static void main(String[] args) {
		// değişkenleri oluştur
		int mat,fizik,kimya,turkce,tarih,resim;
		
		//Scanner sınıfımızı tanımladık
		Scanner input= new Scanner(System.in);
		
		//Kullanıcıdan değerleri alıyoruz
		
		System.out.print("Matematik notu: ");
		mat = input.nextInt();
		
		System.out.print("Fizik Notu: ");
		fizik = input.nextInt();
		
		System.out.print("Kimya notu: ");
		kimya = input.nextInt();
		
		System.out.print("Turkce notu: ");
		turkce = input.nextInt();
		
		System.out.print("Tarih notu: ");
		tarih = input.nextInt();
		
		System.out.print("Resim notu: ");
		resim = input.nextInt();
		
		
	// Toplamı hesaplayıp ders sayısına bölüyoruz
		
		int toplam = (mat+fizik+kimya+turkce+tarih+resim);
		double sonuc= toplam/6.0;
		
		System.out.print("Ortalamanız: " + sonuc );
		
		 var durum = sonuc < 60 ? "Kaldınız.":"Geçtiniz!";
		 
		 System.out.println(durum);
	}

}
