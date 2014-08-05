package food.fruit;

import food.Food;
import food.baketypes.Bakeable;
import food.baketypes.Boilable;
import food.baketypes.Cutable;
import food.baketypes.Dryable;
import food.baketypes.Fryable;
import food.baketypes.Shredable;

public class Apple extends Food implements Bakeable, Fryable, Boilable,
		Shredable, Cutable, Dryable {

	public Apple() {
		super(10, 52, 2.0);
	}

	public Apple(int space, int energy, double cost) {
		super(space, energy, cost);
	}

	@Override
	public Food boil(int time) {
		return null;
	}

	@Override
	public Food fry(int temp, int time) {
		return null;
	}

	@Override
	public Food bake(int temp, int time) {
		return null;
	}

	@Override
	public Food[] cut() {
		return null;
	}

	@Override
	public Food[] shred() {
		return null;
	}

	@Override
	public Food dry() {
		return null;
	}
}
