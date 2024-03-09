package User;
import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		
		String userName,password,choice;
		Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Username: ");
	userName = input.nextLine();
	
	System.out.println("Enter Password: ");
	password = input.nextLine();
	
	if (userName.equals("patika") && password.equals("java123")){
		System.out.println("Logged Succesfully.");
	} else {
		System.out.println("Username or Password wrong.");
		System.out.println("Do you want to reset passsword?\nYes or No");
		choice = input.nextLine();
		
		if (choice.equals("Yes")) { 
			
			System.out.println("Enter new password: ");
			password = input.nextLine();
			
				if(password.equals("java123")) {
					
					System.out.println("Password can not be same as old password.");
					
				} else {
					
					System.out.println("Password changed succesfully.");
				} 
			
		} else 
		{
			System.out.println("Logging Unsuccesful.");
		} 
	}
	
	
} 
	}
