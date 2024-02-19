package com.java.inner;

public class MemberInnerClass {

	private String customerName;
	private Item[] items;
	
	//Constructor
	public MemberInnerClass(String customerName) {
		this.customerName = customerName;
		this.items = new Item[5];
	}
	
	public void addItem(String itemName, double price, int quantity) {
		Item newItem = new Item(itemName, price, quantity);
		for(int i=0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = newItem;
				break;
			}
		}
	}
	
	public void displayItem() {
		System.out.println("Items in " + customerName + " s shopping cart:");
		for(Item item : items) {
			if(item != null) {
				System.out.println(item);
			}
		}
	}
	
	class Item {
		private String name;
		private double price;
		private int quantity;
		
		public Item(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return name + " - $ " + price + " x " + quantity;
		}
		
	}
	
	public static void main(String[] args) {
		MemberInnerClass cart = new MemberInnerClass("Divya");
		
		cart.addItem("Laptop", 12200, 1);
		cart.addItem("Mobile", 10000, 2);
		
		cart.displayItem();
	}

}
