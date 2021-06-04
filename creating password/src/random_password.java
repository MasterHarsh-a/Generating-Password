import java.util.*;
public class random_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length =10;
		System.out.println(Pasword(length));

	}
	static char[] Pasword(int len) 
	{
		System.out.println("Generating Password using random method");
		System.out.print("Your new Password is : ");
		
		String Captial_letters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_letters ="abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String Symbols= "!@#$%^&*_-+/.,><()";
		String values = Captial_letters +Small_letters+numbers+Symbols;
		//using  random_method
		Random random_method  = new Random();
		
		
		 char[] password = new char[len];
		 for(int i = 0;i <len; i++)
		 {
			 password[i] = values.charAt(random_method.nextInt(values.length()));
			 
		 }
		return password;
		
		
		
	}
	

}
