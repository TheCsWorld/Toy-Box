package toys;

public abstract class Toy {
	protected String manufacturer;
	protected double price;
	protected double length;
	protected double width;
	protected double weight;
	protected String colour;
	private int yearOfRelease;
	
	public Toy(String manufacturer, double price, double length, double width, double weight, String colour,
			int yearOfRelease) {
		super();
		this.manufacturer = manufacturer;
		this.price = price;
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.colour = colour;
		this.yearOfRelease = yearOfRelease;
	}
	
	public Toy() {
		
	}

	public Toy(String manufacturer, double length, String colour) {
		this.manufacturer = manufacturer;
		this.length = length;
		this.colour = colour;
	}
	
	public abstract void play();

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}


	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	
	@Override
	public String toString() {
		return "Toy [manufacturer=" + manufacturer + ", price=" + price + ", length=" + length + ", width=" + width
				+ ", weight=" + weight + ", colour=" + colour + ", yearOfRelease=" + yearOfRelease + "]";
	}

	
	
	
	

}
