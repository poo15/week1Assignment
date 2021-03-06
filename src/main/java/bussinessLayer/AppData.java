/*
* Class name:- AppData
*
* Version:- 0.0.1-SNAPSHOT
*
* Copyright notice
* 
* Author info:- Pooja3149914
*
* Creation date:- January 11, 2019 at 12:58:02 PM
*
* Last updated By:- Pooja3149914
*
* Last updated Date:- January 14, 2019 at 8:38:37 PM
*
*/
package bussinessLayer;

import java.util.*;

import dataLayer.DataBase;

public class AppData {
private static AppData appData = null;
	
	private AppData(){
		
	}
	
	public static AppData getAppData(){
		
		if(appData == null)
			appData = new AppData();
		return appData;
	}
	
	public void addItem(Item item){
		double finalCost=0;
		if(item.getType().equalsIgnoreCase("raw") || item.getType().equalsIgnoreCase("r")){
			finalCost = (12.5 * item.getPrice() ) / 100;
		}
		
		else if(item.getType().equalsIgnoreCase("manufactured") || item.getType().equalsIgnoreCase("r")){
			 finalCost = (12.5 * item.getPrice() ) / 100;
			 finalCost = finalCost + (2 * (item.getPrice() + finalCost)) / 100;
		}
		
		else if(item.getType().equalsIgnoreCase("imported") || item.getType().equalsIgnoreCase("r")){
					double cost = ( 10 * item.getPrice() ) / 100;
					if(cost <= 100)
						finalCost = cost + 5;
					else if(cost > 100 && cost <= 200)
						finalCost = cost + 10;
					else
					{
						finalCost = cost + (10 * ( cost + item.getPrice() )) / 100;
					}
		}
		item.setFinalCost(item.getPrice()+finalCost);
		DataBase.getDatabase().addToList(item);
	}
	
	public List<Item> showItems(){
		return DataBase.getDatabase().showItems();		 
	}
}
