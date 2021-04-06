package exceptions;
import java.util.*;

//exercise 1

public class Person {
	private String name;
	private int age;

	public Person(int age) {
		try {
			if (age < 17 || age > 24) {
				String msg = "Age is not between 17 and 24";
				throw new AgeDoesnotMatchException(msg);

			}
		} catch (AgeDoesnotMatchException e) {
			System.out.println(e);
			System.exit(1);
		}

		this.age = age;
	}

	public void display() {

		System.out.println("Age of the person: " + this.age);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the Student should be 17 to 24(including 17 and 24): ");
		int age = sc.nextInt();
		Person obj = new Person(age);
		obj.display();
	}
}
