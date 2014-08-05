package entities.food.baketypes;

import entities.food.Food;

public interface Broilable {
	public Food broil(int temp, int time);
}
