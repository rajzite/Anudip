import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println("Its a Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}

	}
	static boolean isPrime(int num) {
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
