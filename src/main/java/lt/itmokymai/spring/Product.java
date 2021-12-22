package lt.itmokymai.spring;

public class Product {
	private String title;
	private String image;
	private String description;
	private String price;
	private String quantity;
	
	public Product() {
		
	}
	
	public Product(String title, String image, String description, String price, String quantity) {
		super();
		this.title = title;
		this.image = image;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product \n title: " + title + ",\n image: " + image + ",\n description: " + description + ",\n price: " + price
				+ ",\n quantity: " + quantity;
	}
	
	
	
}
