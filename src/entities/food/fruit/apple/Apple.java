package entities.food.fruit.apple;

import entities.food.Food;
import entities.food.baketypes.Bakeable;
import entities.food.baketypes.Boilable;
import entities.food.baketypes.Cutable;
import entities.food.baketypes.Fryable;
import entities.food.baketypes.Shredable;

public class Apple extends Food implements Bakeable, Fryable, Boilable,
		Shredable, Cutable {

	public Apple() {
		super(10, 52, 5.0);
	}

	public Apple(int space, int energy, double cost) {
		super(space, energy, cost);
	}

	@Override
	public Food boil(int temp, int time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food fry(int temp, int time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food bake(int temp, int time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food cut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food shred() {
		// TODO Auto-generated method stub
		return null;
	}
}
