package entities.food.baketypes;

import entities.food.Food;

public interface Fryable {
	public Food fry(int temp, int time);
}
