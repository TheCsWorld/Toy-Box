package toys;

public abstract class ToyCar extends Toy{
	
	protected int wheels;
	protected int type;
	protected int speed;

	public ToyCar(String manufacturer, double price, double length, double width, double weight, String colour, int yearOfRelease,
			int wheels, int  type, int speed2) {
		super(manufacturer, price, length, width, weight, colour, yearOfRelease);
		this.wheels = wheels;
		this.type = type;
		this.speed = speed;
	}
	
	public ToyCar() {
		super();
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing with toy car.");
	}
	
	public abstract void drive();
	public abstract void brake();
	public abstract void speedUp();
	public abstract void slowDown();
	public abstract boolean isMoving();
	

}
