package toys;

public class Doll extends Toy{
	
	private String hairColour;
	private String eyeColour;
	private String name;
	public Doll(String manufacturer, double price, double length, double width, double weight, String colour,int yearOfRelease,
			String hairColour, String eyeColour, String name) {
		super(manufacturer, price, length, width, weight, colour, yearOfRelease);
		this.hairColour = hairColour;
		this.eyeColour = eyeColour;
		this.name = name;
	}
	public String getHairColour() {
		return hairColour;
	}
	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}
	public String getEyeColour() {
		return eyeColour;
	}
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	

}
