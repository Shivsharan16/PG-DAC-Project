package com.AyurHealth.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import com.AyurHealth.entities.CartDetalis;
import com.AyurHealth.entities.User;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private int Id;

    private UserDto user;

    private float TotalAmount;

    public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public float getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		TotalAmount = totalAmount;
	}

	public List<CartDetailDto> getCartDetalis() {
		return cartDetalis;
	}

	public void setCartDetalis(List<CartDetailDto> cartDetalis) {
		this.cartDetalis = cartDetalis;
	}

	private List<CartDetailDto> cartDetalis;
}
