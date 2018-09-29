package toys;

public class HotWheels extends ToyCar{

	
	public HotWheels(String manufacturer, double price, double length, double width, double weight, String colour,
			int yearOfRelease, int wheels, int type, int speed) {
		super(manufacturer, price, length, width, weight, colour, yearOfRelease, wheels, type, speed);
		
	}
	
	public HotWheels() {
		super();
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedUp() {
		speed++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoving() {
		if (speed>0)
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void slowDown() {
		// TODO Auto-generated method stub
		speed--;
		
	}

	

	
	

}
