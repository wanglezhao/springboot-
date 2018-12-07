package com.guweibit.springBootDemo.entity;

//@Entity
//@Table(name = "commodity_list")
public class Commodity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
	private Integer id;
//	@Column(name = "name")
	private String name;
//	@Column(name = "price")
	private Integer price;

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
