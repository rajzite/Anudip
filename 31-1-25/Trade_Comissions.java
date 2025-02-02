import java.util.Scanner;

public class Trade_Comissions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter city : ");
		String city = sc.next();
		city = city.toLowerCase();
		
		System.out.print("Enter price : ");
		double price = sc.nextDouble();

		double discount;
		
		if(city.equals("sofia")) {
			if(price>0 && price<=500) {
				discount = price * 0.05;
				System.out.println(discount);
			}
			else if(price>500 && price<=1000) {
				discount = price * 0.07;
				System.out.println(discount);
			}
			else if(price>1000 && price<=10000) {
				discount = price * 0.08;
				System.out.println(discount);
			}
			else if(price>=10000) {
				discount = price * 0.07;
				System.out.println(discount);
			}
			else {
				System.out.println("Error");
			}
		}
		else if(city.equals("varna")) {
			if(price>0 && price<=500) {
				discount = price * 0.045;
				System.out.println(discount);
			}
			else if(price>500 && price<=1000) {
				discount = price * 0.075;
				System.out.println(discount);
			}
			else if(price>1000 && price<=10000) {
				discount = price * 0.10;
				System.out.println(discount);
			}
			else if(price>=10000) {
				discount = price * 0.13;
				System.out.println(discount);
			}
			else {
				System.out.println("Error");
			}
		}
		else if(city.equals("plovdiv")) {
			if(price>0 && price<=500) {
				discount = price * 0.055;
				System.out.println(discount);
			}
			else if(price>500 && price<=1000) {
				discount = price * 0.08;
				System.out.println(discount);
			}
			else if(price>1000 && price<=10000) {
				discount = price * 0.12;
				System.out.println(discount);
			}
			else if(price>=10000) {
				discount = price * 0.145;
				System.out.println(discount);
			}
			else {
				System.out.println("Error");
			}
		}
		else {
			System.out.println("Error");
		}
		
	}

}
