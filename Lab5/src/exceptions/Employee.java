package exceptions;
import java.util.Scanner;

//exercise 2

public class Employee {
	
	static String firstName=null;
	static String lastName=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first name:");
		firstName=sc.nextLine();
		System.out.println("Enter the last name:");
		lastName=sc.nextLine();
		
		try {
			if(firstName.length()==0||lastName.length()==0) {
				throw new FirstnameOrLastnameNotFound("Both first and last name must not be empty");	
			}	
			else
			{
				System.out.println("Name of the employee: " + firstName+" "+ lastName);
			}
		}
			catch(FirstnameOrLastnameNotFound e) {
				e.printStackTrace();
			}

	}

}
