package com.AyurHealth.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CartDetailDto {

    private int CartDetalisId;
    private ProductDto products;
    private int Quantity;
    public int getCartDetalisId() {
		return CartDetalisId;
	}
	public void setCartDetalisId(int cartDetalisId) {
		CartDetalisId = cartDetalisId;
	}
	public ProductDto getProducts() {
		return products;
	}
	public void setProducts(ProductDto products) {
		this.products = products;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	private int Amount;

//    private CartDto cart;
}
