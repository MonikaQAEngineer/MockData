package Data;

import java.util.Scanner;
import com.github.javafaker.Faker;

public class PersonalData {

public static void main(String[] args) {
  Faker fk = new Faker();
  String firstName,lastName,email,city,country,phoneNumber;
  int entries = 0;
  boolean flag;
	    do{
		try   
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter number of identitied to create: ");
				entries =  sc.nextInt();
				flag=false;
			}
		catch(Exception e)
			{
			// accept integer only.
				System.out.println("Enter only integer value.."+e);
				flag=true;
			}
		}
	    while(flag); 
	    
	    for(int i=0;i<entries;i++)
	    {
	      	firstName = fk.name().firstName();
	    	lastName = fk.name().lastName();
	    	email = fk.internet().emailAddress();
	    	city = fk.address().city();
	    	country = fk.address().country();
	    	phoneNumber = fk.number().digits(9);
	    	System.out.println(email+","+firstName+","+lastName+","+city+","+country+","+phoneNumber);
	    }
	}

}