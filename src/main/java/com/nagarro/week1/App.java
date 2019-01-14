/*
* Class name:- App
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

import bussinessLayer.AppData;
import bussinessLayer.Item;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		String name="",type="";
		char wantToContinue;
		int price=0,quantity=0;
		
		do{
		
			System.out.println("Enter the Item details:- ");
			System.out.println("Name:- ");
			name=sc.next();
			System.out.println("Price:- ");
			price=sc.nextInt();
			System.out.println("Quantity:- ");
			quantity=sc.nextInt();
			System.out.println("Type(Raw/Manufactured/Imported):- ");
			type=sc.next();
			AppData.getAppData().addItem(new Item(name,price,quantity,type));
			System.out.println("Do you want to enter details of any other item(y/n):-");
			wantToContinue = sc.next().charAt(0);
		
		}while(wantToContinue=='y');
		
		List<Item> itemList=AppData.getAppData().showItems();
		
		Iterator<Item> itr= itemList.iterator();
		while(itr.hasNext()){
			Item item = itr.next();
			System.out.println(item.toString(item));
		}
		sc.close();
    }
}
