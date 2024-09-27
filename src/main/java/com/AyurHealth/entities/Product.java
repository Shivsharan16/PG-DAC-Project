package com.AyurHealth.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;
    @Column
    private String ProductName;

    private String Description;
    private Float Price;
    private Float Weight;
    @Column(length = 65555)
    private byte[] Img;

    @OneToMany(mappedBy = "products")
    private List<CartDetalis> list;

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
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

	public List<CartDetalis> getList() {
		return list;
	}

	public void setList(List<CartDetalis> list) {
		this.list = list;
	}
    

}
