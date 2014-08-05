package buildings;

import java.util.LinkedList;
import java.util.List;

import buildings.furnishings.Counter;
import buildings.furnishings.Furnishing;
import buildings.furnishings.Sink;
import buildings.furnishings.Stove;
import entities.food.Food;
import error.NoSuchFurnishingIDError;
import error.NotEnoughSpaceInKitchenError;
import error.OutOfStorageSpaceError;

public class Home extends Building {
	private List<Furnishing> contents;

	public Home() {
		this.contents = new LinkedList<Furnishing>();
		this.contents.add(new Counter(100, 100));
		this.contents.add(new Sink(90, 110));
		this.contents.add(new Stove(50, 200));
	}

	public void addFurnishing(Furnishing f) {
		this.contents.add(f);
	}

	/**
	 * Add the given food to the first furnishing in the list with enough space.
	 * It is <i>highly recommended</i> that {@link #addFood(Food, int)} is used
	 * instead as this method essentially fills up {@link Furnishing}s in the
	 * order bought, instead of where the user wants them.
	 * 
	 * @param f
	 *            the food to be added to the kitchen
	 */
	public void addFood(Food f) throws NotEnoughSpaceInKitchenError,
			OutOfStorageSpaceError {
		boolean foodAdded = false;

		for (Furnishing object : this.contents) {
			object.addItem(f);
			foodAdded = true;
			break;
		}

		if (!foodAdded) {
			throw new NotEnoughSpaceInKitchenError(
					"No item in the kitchen has enough unused space to store this item.");
		}
	}

	public void addFood(Food f, int index) {
		this.contents.get(index).addItem(f);
	}

	public void addFood(Food f, long fID) {
		boolean foodAdded = false;

		for (Furnishing object : this.contents) {
			if (object.getID() == fID) {
				object.addItem(f);
			}
		}

		if (!foodAdded) {
			throw new NoSuchFurnishingIDError(
					"No item in the kitchen has the specified ID.");
		}
	}
}
