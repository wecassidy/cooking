package entities.food.baketypes;

import entities.food.Food;

public interface Bakeable {
	public Food bake(int temp, int time);
}
