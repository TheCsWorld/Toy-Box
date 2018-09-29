package toys;

public class PlayStation extends GameConsole{

	private int onButton;
	public PlayStation(String manufacturer, double price, double length, double width, double weight, String colour,
			int yearOfRelease, int numberOfGames, int memory) {
		super(manufacturer, price, length, width, weight, colour, yearOfRelease, numberOfGames, memory);
		
	}

	@Override
	public boolean isOn() {
		if (onButton == 1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public String buttonPressed() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
