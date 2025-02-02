import java.util.Scanner;

public class Fruit_Shop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fruit : ");
		String fruit = sc.next();
		fruit = fruit.toLowerCase();
		
		System.out.print("Enter day : ");
		String day = sc.next();
		day = day.toLowerCase();
		
		System.out.print("Enter quantity : ");
		double quantity = sc.nextDouble();
		
		double price;
		
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
			if(fruit.equals("banana")) {
				double amount = 2.50;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("apple")) {
				double amount = 1.20;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("orange")) {
				double amount = 0.85;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("grapefruit")) {
				double amount = 1.45;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("kiwi")) {
				double amount = 2.70;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("pineapple")) {
				double amount = 5.50;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("grapes")) {
				double amount = 3.85;
				price = amount * quantity;
				System.out.println(price);
			}
			else {
				System.out.println("Error");
			}
		}
		else if(day.equals("saturday") || day.equals("sunday")) {
			if(fruit.equals("banana")) {
				double amount = 2.70;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("apple")) {
				double amount = 1.25;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("orange")) {
				double amount = 0.90;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("grapefruit")) {
				double amount = 1.60;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("kiwi")) {
				double amount = 3.00;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("pineapple")) {
				double amount = 5.60;
				price = amount * quantity;
				System.out.println(price);
			}
			else if(fruit.equals("grapes")) {
				double amount = 4.20;
				price = amount * quantity;
				System.out.println(price);
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
