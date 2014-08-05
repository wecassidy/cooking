package entities.food.fruit.apple;

import entities.food.Food;
import entities.food.baketypes.Bakeable;
import entities.food.baketypes.Boilable;
import entities.food.baketypes.Cutable;
import entities.food.baketypes.Dryable;
import entities.food.baketypes.Fryable;
import entities.food.baketypes.Shredable;

public class Apple extends Food implements Bakeable, Fryable, Boilable,
		Shredable, Cutable, Dryable {

	public Apple() {
		super(10, 52, 2.0);
	}

	public Apple(int space, int energy, double cost) {
		super(space, energy, cost);
	}

	@Override
	public Food boil(int temp, int time) {
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
		return new AppleSlice[5];
	}

	@Override
	public Food[] shred() {
		return new AppleShred[50];
	}

	@Override
	public Food dry() {
		return null;
	}
}
