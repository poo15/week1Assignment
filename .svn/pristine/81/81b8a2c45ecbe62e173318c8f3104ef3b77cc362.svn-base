/*
* Class name:- Item
*
* Version:- 0.0.1-SNAPSHOT
*
* Copyright notice
* 
* Author info:- Pooja3149914
*
* Creation date:- January 11, 2019 at 01:33:15 PM
*
* Last updated By:- Pooja3149914
*
* Last updated Date:- January 14, 2019 at 8:35:22 PM
*
*/

package bussinessLayer;

public class Item {
	private String name,type;
	private double price,finalCost;
	private int quantity;
	
	public Item(String name,int price, int quantity,String type)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.type=type;
	}
	
	public double getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(double finalCost) {
		this.finalCost = finalCost;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString(Item item){
		return "Name:- "+item.name+"  Price:- "+item.price+"  Sales Tax:- "+
		(item.finalCost - item.price)+" Final cost:- "+item.finalCost;
	}
}
