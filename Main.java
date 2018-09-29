package toys;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		HotWheels hwcar = new HotWheels();	//creates object from HotWheels class
		hwcar.play();
		
		PlayStation ps = new PlayStation("Sony", 5.0, 6.0, 7.0, 8.0, "Yellow", 1, 2, 3); //creates object from PlayStation class
		ps.play();
		
		ArrayList<Toy> toys = new ArrayList<Toy>();	//ArrayList where toys will be added
		toys.add(ps);
		toys.add(hwcar);
		
		for (Toy toy: toys) {
			toy.play();
		}
	}
}
