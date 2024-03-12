package Power;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
//		Java döngüler ile girilen sayıya 
//		kadar olan 4 ve 5'in kuvvetlerini ekrana 
//		yazdıran programı yazıyoruz.
		int number=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number= input.nextInt();
		
			for(int i=1;i<=number;i*=4) {
				System.out.println(i);	
			
		}
			for(int i=1;i<=number;i*=5) {
				System.out.println(i);	
			
		}
	}

}
