package toys;

public abstract class GameConsole extends Toy{
	
	protected String modelName;
	protected int numberOfGames;
	protected int memory;
	
	public GameConsole(String manufacturer, double price, double length, double width, double weight, String colour, int yearOfRelease,
			int numberOfGames, int memory) {
		super(manufacturer, price, length, width, weight, colour, yearOfRelease);
		this.modelName = modelName;
		this.numberOfGames = numberOfGames;
		this.memory = memory;
	}

	public int getNumberOfGames() {
		return numberOfGames;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setNumberOfGames(int numberOfGames) {
		this.numberOfGames = numberOfGames;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing with a game console");
	}
	
	public abstract boolean isOn();
	public abstract String buttonPressed(); 

}
