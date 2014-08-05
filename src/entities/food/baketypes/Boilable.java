package entities.food.baketypes;

import entities.food.Food;

public interface Boilable {
	public Food boil(int temp, int time);
}
