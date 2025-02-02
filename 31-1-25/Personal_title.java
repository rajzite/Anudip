import java.util.Scanner;

public class Personal_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		System.out.print("Enter your gender M/F :");
		String gender = sc.next();
		gender = gender.toLowerCase();
		
		if(age>0) {
			if (gender.equals("m")) {
				if (age >= 16) {
					System.out.println("Mr.");
				} else {
					System.out.println("Master");
				}
			}
			else if(gender.equals("f")) {
				if (age >= 16) {
					System.out.println("Ms.");
				} else {
					System.out.println("Miss");
				}
			} 
			else {
				System.out.println("Enter valid gender");
			}
		}
		else {
			System.out.println("Enter valid age");
		}
	}
}
