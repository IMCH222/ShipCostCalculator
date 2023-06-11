import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double itemPrice = 0;
double shippingCost = 0;
double totalPrice = 0;
int shipPoint = 100;
shippingCost = itemPrice * 0.02;
totalPrice = itemPrice + shippingCost;

System.out.print("Enter your item price: ");

itemPrice = in.nextDouble();
in.nextLine();

if (itemPrice >= shipPoint) {
    System.out.println("Your item price is: " + itemPrice + " " + "Therefore shipping is free!");
    totalPrice = itemPrice;
    System.out.println("Your total price is: " + totalPrice);
}
else if(itemPrice < shipPoint) {
    System.out.println("Your item price is: " + itemPrice + " " + "Therefore you must pay for shipping");
    shippingCost = itemPrice * 0.02;
    System.out.println("Your cost of shipping will be: " + shippingCost);
    totalPrice = itemPrice + shippingCost;
    System.out.println("Your total cost is: " + totalPrice);
}





    }
}