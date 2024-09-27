package com.AyurHealth.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductDto {
    private int Productid;
    private String ProductName;
    private String Description;
    private Float Price;
    private Float Weight;
    private byte[] Img;
    
    
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDto(int productid, String productName, String description, Float price, Float weight, byte[] img) {
		super();
		Productid = productid;
		ProductName = productName;
		Description = description;
		Price = price;
		Weight = weight;
		Img = img;
	}
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		Productid = productid;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}
	public Float getWeight() {
		return Weight;
	}
	public void setWeight(Float weight) {
		Weight = weight;
	}
	public byte[] getImg() {
		return Img;
	}
	public void setImg(byte[] img) {
		Img = img;
	}
}
