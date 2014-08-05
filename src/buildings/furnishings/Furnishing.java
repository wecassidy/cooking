package buildings.furnishings;

import java.util.LinkedList;
import java.util.List;

import run.IDManager;
import error.OutOfStorageSpaceError;
import food.Food;

public abstract class Furnishing {
	private final int STORAGE;
	private final int COST;
	private static long NEXTID = 0L;
	private final long ID;
	private int storageUsed;
	private List<Food> contents;

	public Furnishing() {
		this.STORAGE = 0;
		this.COST = 0;
		this.ID = IDManager.assignFurnishingID();
		this.storageUsed = 0;
		this.contents = new LinkedList<Food>();
	}

	public Furnishing(int storageSpace, int cost) {
		this.STORAGE = storageSpace;
		this.COST = cost;
		this.ID = IDManager.assignFurnishingID();
		this.storageUsed = 0;
		this.contents = new LinkedList<Food>();
	}

	public int getStorageSpace() {
		return this.STORAGE;
	}

	public int getCost() {
		return this.COST;
	}

	public List<Food> getContents() {
		return this.contents;
	}

	public long getID() {
		return this.ID;
	}

	public void addItem(Food food) throws OutOfStorageSpaceError {
		if (this.storageUsed + food.getSize() > this.STORAGE) {
			throw new OutOfStorageSpaceError((this.STORAGE - this.storageUsed)
					+ " storage space left, item requires " + food.getSize()
					+ ".");
		}

		this.contents.add(food);
		this.storageUsed += food.getSize();
	}
}
