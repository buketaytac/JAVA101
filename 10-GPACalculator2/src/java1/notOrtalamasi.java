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
		
		if (mat < 0 || mat > 100) {
			
			int toplam = (fizik+kimya+turkce+tarih+resim);
			double sonuc= toplam/6.0;
			
			System.out.print("Ortalamanız: " + sonuc );
			
			 var durum = sonuc < 55 ? "Kaldınız.":"Geçtiniz!";
			 
			 System.out.println(durum);
			 
		}  if (fizik < 0 || fizik > 100) {
			
			int toplam = (mat+kimya+turkce+tarih+resim);
			double sonuc= toplam/6.0;
			
			System.out.print("Ortalamanız: " + sonuc );
			
			 var durum = sonuc < 55 ? "Kaldınız.":"Geçtiniz!";
			 
			 System.out.println(durum);
			 
		}  if (kimya < 0 || kimya > 100) {
			
			int toplam = (fizik+mat+turkce+tarih+resim);
			double sonuc= toplam/6.0;
			
			System.out.print("Ortalamanız: " + sonuc );
			
			 var durum = sonuc < 55 ? "Kaldınız.":"Geçtiniz!";
			 
			 System.out.println(durum);
			 
		}  if (turkce < 0 || turkce > 100) {
			
			int toplam = (fizik+kimya+mat+tarih+resim);
			double sonuc= toplam/6.0;
			
			System.out.print("Ortalamanız: " + sonuc );
			
			 var durum = sonuc < 55 ? "Kaldınız.":"Geçtiniz!";
			 
			 System.out.println(durum);
			 
		}  if (tarih < 0 || tarih > 100) {
			
			int toplam = (fizik+kimya+turkce+mat+resim);
			double sonuc= toplam/6.0;
			
			System.out.print("Ortalamanız: " + sonuc );
			
			 var durum = sonuc < 55 ? "Kaldınız.":"Geçtiniz!";
			 
			 System.out.println(durum);
			 
		}  if (resim < 0 || resim > 100) {
			
			int toplam = (fizik+kimya+turkce+tarih+mat);
			double sonuc= toplam/6.0;
			
			System.out.println("Ortalamanız: " + sonuc );
			
			 var durum = sonuc < 55 ? "Kaldınız.":"Geçtiniz!";
			 
			 System.out.println(durum);
		}  
		
	}

}
