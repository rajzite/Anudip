import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int originalnum = num;
		int reversednum = 0;
		
		while(num!=0) {
			int digit = num %10; 
			reversednum = reversednum * 10 +digit; 
			num /=10; 
		}
		
		if(reversednum == originalnum) {
			System.out.println(originalnum + " is an Palindrom");
		}else {
			System.out.println(originalnum + " is not an Palindrom");
		}
	}

}
