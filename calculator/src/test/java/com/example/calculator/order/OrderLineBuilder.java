package com.example.calculator.order;

public class OrderLineBuilder {
	
	int quantity = 1;
	String item = "a hat";
	
	public static OrderLineBuilder anOrderLine() {
		return new OrderLineBuilder();
	}
	
	public static OrderLineBuilder anOrderLine(String item, int quantity) {
		return new OrderLineBuilder().withItem(item).withQuantity(quantity);
	}
	
	public OrderLineBuilder withQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	public OrderLineBuilder withItem(String item) {
		this.item = item;
		return this;
	}
	
	public OrderLine build() {
		OrderLine orderLine = new OrderLine();
		orderLine.quantity(quantity);
		orderLine.item(item);
		return orderLine;
	}
}
