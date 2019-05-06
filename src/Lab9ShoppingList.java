//Nikki Rawetzki Lab 9 April 2019

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.validation.Validator;


public class Lab9ShoppingList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Guenther's Market!");
		System.out.println("Item" + "             " + "Price");
		
		ArrayList<String> itemName = listOfNames();
		ArrayList<Double> itemPrice = listOfPrices();
		ArrayList<String> orderName = new ArrayList<String>();
		ArrayList<Double> orderPrice = new ArrayList<Double>();
		String userCont;


	do {
		System.out.println("What item would you like to order?");
		String itemOrder = scan.nextLine();
	
	
	String itemOrdered;
	if (itemOrdered.equalsIgnoreCase("banana")) {
		orderName.add("banana");
		orderPrice.add(0.59);
		System.out.println("banana has been added to your order for $0.59");
	} else if (itemOrdered.equalsIgnoreCase("apple")) {
		orderName.add("apple");
		orderPrice.add(0.99);
		System.out.println("apple has been added to your order for $0.99");
	} else if (itemOrdered.equalsIgnoreCase("cauliflower")) {
		orderName.add("cauliflower");
		orderPrice.add(1.59);
		System.out.println("cauliflower has been added to your order for $1.59");
	} else if (itemOrdered.equalsIgnoreCase("dragonfruit")) {
		orderName.add("dragonfruit");
		orderPrice.add(2.19);
		System.out.println("dragonfruit has been added to your order for $2.19");
	} else if (itemOrdered.equalsIgnoreCase("elderberry")) {
		orderName.add("elderberry");
		orderPrice.add(2.09);
		System.out.println("elderberry has been added to your order for $1.79");
	} else if (itemOrdered.equalsIgnoreCase("figs")) {
		orderName.add("figs");
		orderPrice.add(2.09);
		System.out.println("figs have been added to your order fo $2.09");
	} else if (itemOrdered.equalsIgnoreCase("grapefruit")) {
		orderName.add("grapefruit");
		orderPrice.add(1.99);
		System.out.println("grapefruit has been added to your order for $1.99");
	} else if (itemOrdered.equalsIgnoreCase("honeydew")) {
		orderName.add("honeydew");
		orderPrice.add(3.49);
		System.out.println("honeydew has been added to your order for $3.49");
	} else {
		System.out.println("Sorry, we don't have those! Please try again");
	} System.out.println("would you like to order anyting else? (y/n)");
	userCont = scan.nextLine();
	}
	
 while (userCont.equalsIgnoreCase("y"));

 	System.out.println("Thanks for your order!");
 	System.out.println("Here's what you got: ");
 	printMenu(orderName, orderPrice);
	
	
	private static void printMenu(ArrayList<String> orderName, ArrayList<Double> orderPrice) {
		
		
	}



	public static ArrayList<String>listOfNames(){
		ArrayList<String> itemName = new ArrayList<String>();
		itemName.add("apple");
		itemName.add("banana");
		itemName.add("cauliflower");
		itemName.add("dragonfruit");
		itemName.add("Elderberry");
		itemName.add("figs");
		itemName.add("grapefruit");
		itemName.add("honeydew");
		
		return itemName;
	}
	
	public static ArrayList<Double>listOfPrices(){
		ArrayList<Double> itemPrice = new ArrayList<Double>();
		itemPrice.add(0.99);
		itemPrice.add(0.59);
		itemPrice.add(1.59);
		itemPrice.add(2.19);
		itemPrice.add(1.79);
		itemPrice.add(2.09);
		itemPrice.add(1.99);
		itemPrice.add(3.49);
		
		return itemPrice;
	}
	
    public static int totalPrice(int[] orderPrice) {
        int sum = 0;
        
        for(int i = 0; i < orderPrice.length; i++) {
            sum += orderPrice[i];
            
        }
        return sum;
    }

}