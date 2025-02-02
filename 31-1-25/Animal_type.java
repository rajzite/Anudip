import java.util.Scanner;

public class Animal_type {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter animal : ");
		String animal = sc.next();
		animal=animal.toLowerCase();
		
		if(animal.equals("tortoise")) {
			System.out.println("reptile");
		}
		else if(animal.equals("dog")) {
			System.out.println("mammal");
		}
		else {
			System.out.println("unknown");
		}
		
	}

}
