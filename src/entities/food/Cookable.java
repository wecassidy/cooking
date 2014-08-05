package entities.food;

import java.util.HashMap;

public abstract class Cookable extends Food {
	private HashMap<int[], Food> cookMap;
	private String bakeType;

	public Cookable() {
		this.cookMap = new HashMap<int[], Food>();
	}

	public Cookable(HashMap<int[], Food> cookTimes) {
		this.cookMap = cookTimes;
	}

	public Food bakeFor(int temperature, int time) {
		return this.cookMap.get(new int[] {temperature, time}); // TODO make
																// sure time and
																// temperature
																// match a value
																// in bakeMap
	}

	public Food bakeFor(int[] tempTime) {
		return this.bakeFor(tempTime[0], tempTime[1]);
	}
}
