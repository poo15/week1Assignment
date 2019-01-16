/*
* Class name:- AppClass
*
* Version:- 0.0.1-SNAPSHOT
*
* Copyright notice
* 
* Author info:- Pooja3149914
*
* Creation date:- January 11, 2019 at 12:33:25 PM
*
* Last updated By:- Pooja3149914
*
* Last updated Date:- January 14, 2019 at 8:27:44 PM
*
*/

package com.nagarro.week1;

import java.util.*;

import businessLayer.AppData;
import businessLayer.Item;
import businessLayer.ItemTypeException;
import businessLayer.NumberException;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
		String name="";
		String type="";
		char wantToContinue;
		double price=0;
		int quantity=0;
		int check=0;
		AppData appData = new AppData();
		do {
			check=0;
			System.out.println("Enter the Item details");
			System.out.print("Name:- ");
			name=scanner.next();
			
			System.out.print("Price and Type:- ");
			String s1 = scanner.next();
			String s2 = scanner.next();
			try{
				price = Double.parseDouble(s1);
				type = s2;
			} catch(Exception e){
				type = s1;
				try{
				price = Double.parseDouble(s2);
				}catch(Exception doubleException){
				}
			}

			while(true){
				if(checkType(type)) {
					break;
				}
				else {
					System.out.println("Enter the Type (RAW/MANUFACTURED/IMPORTED):- ");
					type = scanner.next();
				}
			}
			while(true){
				if(checkPrice(price)) {
					break;
				}
				else {
					System.out.println("Enter the Price:- ");
					price = Double.parseDouble(scanner.next());
				}
			}
			
			System.out.println("Type:- "+type+" price:- "+price);
			check=0;
			
			do {
				System.out.println("Quantity:- ");
				
				try{
					quantity=Integer.parseInt(scanner.next());
			
					if(quantity < 0) {	
						throw new NumberException("Please Enter the valid Quantity can't be less than 0");
					}
					check=1;
				} catch (NumberException quantityException) {
					System.out.println(quantityException.getMessage());
				}
				
			} while (check==0);

			appData.addItem(new Item(name,price,quantity,type));
			System.out.println("Do you want to enter details of any other item(y/n):-");
			wantToContinue = scanner.next().charAt(0);
			scanner.nextLine();
		
		} while (wantToContinue=='y');
		
		List<Item> itemList=appData.showItems();
		
		itemList.forEach(item -> System.out.println(item.toString()));
		
		scanner.close();
    }
    
    public static boolean checkPrice(double price){
    	try{
		
    		if(price <= 0){	
    			throw new NumberException("Please Enter the valid Price can't be 0 or less");
    		}
    	} catch(NumberException priceException) {
    		System.out.println(priceException.getMessage());
    		return false;
    	}
    	return true;
    }
    
    public static boolean checkType(String type){
    	
    	try {
			if((type.equalsIgnoreCase("raw"))
					|| (type.equalsIgnoreCase("manufactured"))
					|| (type.equalsIgnoreCase("imported"))) {
			} else {
				throw new ItemTypeException("Type should be (Raw/Manufactured/Imported)");
			}
		} catch (ItemTypeException itemTypeException) {
			System.out.println(itemTypeException.getMessage());
			return false;
		}
    	return true;
    }
}
