package buildings.furnishings;

import food.Food;
import food.baketypes.Bakeable;

public class Oven extends Furnishing {
	private int low;
	private int high;
	private boolean on;

	public Oven() {
		super();

		this.low = 100;
		this.high = 700;
		this.on = false;
	}

	public Oven(int storageSpace, int cost) {
		super(storageSpace, cost);

		this.low = 100;
		this.high = 700;
		this.on = false;
	}

	public Oven(int low, int high, boolean on) {
		super();

		this.low = low;
		this.high = high;
		this.on = on;
	}

	public Oven(int storageSpace, int cost, int low, int high, boolean on) {
		super(storageSpace, cost);

		this.low = low;
		this.high = high;
		this.on = on;
	}

	public Food bake(Bakeable food, int time, int temperature) {
		return food.bake(temperature, time);
	}

}
