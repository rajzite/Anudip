import java.util.Scanner;

public class Even_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min,max;
		System.out.print("Enter First Number :");
		min=sc.nextInt();
		System.out.print("Enter Second Maximum : ");
		max=sc.nextInt();
		if(min<max) {
			System.out.println("Even Numbers between "+min+" and "+max);
			while(min<=max) {
				if(min%2==0) {
					System.out.print(min +" ");
					min++;
				}else {
					min++;
				}
			}
		}else {
			System.out.println("Even Numbers between "+max+" and "+min);
			while(min>=max) {
				if(min%2==0) {
					System.out.print(min+" ");
					min--;
				}else {
					min--;
				}
			}
		}
	}
}
