import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int originalnum = num;
		
		int numdigit = 0;
		int temp = num;
		while(temp!=0) {
			numdigit++;
			temp/=10;
		}
		
		int sum =0;
		temp = num;
		while(temp!=0) {
			int digit = temp % 10;
			int power = 1;
			for(int i=0;i<numdigit;i++) {
				power *= digit;
			}
			sum += power;
			temp/=10;
		}
		
		if(sum == originalnum) {
			System.out.println(originalnum + " is an Armstrong number");
		}else {
			System.out.println(originalnum + " is not an Armstrong number");
		}
	}
}
