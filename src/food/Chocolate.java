package food;

import food.baketypes.Cutable;
import food.baketypes.Meltable;
import food.baketypes.Shredable;
import food.baketypes.Stirable;

public class Chocolate extends Food implements Cutable, Meltable, Shredable,
		Stirable {

	@Override
	public Food[] cut() {

		return null;
	}

	@Override
	public Food[] shred() {

		return null;
	}

	@Override
	public Food melt() {

		return null;
	}

	@Override
	public Food stir(int time) {
		if (this.properties.melted) {
			// TODO: Implement sunshine and rainbows
			this.properties.stirred = true;
			return this;
		}
		else
			return this;
	}

}
