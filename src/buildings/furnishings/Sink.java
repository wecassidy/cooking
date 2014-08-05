package buildings.furnishings;

import food.Food;

public class Sink extends Furnishing {
	public Sink() {
		super(90, 110);
	}

	public Sink(int storageSpace, int cost) {
		super(storageSpace, cost);
	}

	public void wash(Food f) {
		if (f.getFreshness() >= 0.9) {
			f.setFreshness(1);
		}
		else {
			f.setFreshness(f.getFreshness() + 0.1);
		}
	}
}
