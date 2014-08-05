package entities.food;

/**
 * Represents a food with a certain size, price, time until it spoils,
 * bake-ability, baked food, and energy to be gained by eating it.
 */
public abstract class Food {
	/**
	 * The size of the food
	 */
	private final int SIZE;

	/**
	 * The amount of energy to be gained by eating this food
	 */
	private final int ENERGY;

	/**
	 * The price of the food
	 */
	private final double COST;

	/**
	 * How much longer the food will remain fresh
	 */
	private double fresh;

	private boolean[] attributes;

	/**
	 * Create a food with all falsy values ({@code 0} for {@code int}s,
	 * {@code false} for {@code boolean}s, and {@code null} for reference
	 * types).
	 */
	public Food() {
		this.SIZE = 0;
		this.ENERGY = 0;
		this.COST = 0;
		this.fresh = 1;
		attributes = new boolean[6];
	}

	/**
	 * Create a food with a given size and default values for the rest (see
	 * {@link #Food()} for those values).
	 * 
	 * @param size the amount of space required to store the food.
	 */
	public Food(int size) {
		this.SIZE = size;
		this.ENERGY = 0;
		this.COST = 0;
		this.fresh = 1;
		attributes = new boolean[6];
	}

	/**
	 * Create a food with a given size and energy and default values for the
	 * rest (see {@link #Food()} for those values).
	 * 
	 * @param size the amount of space required to store the food
	 * @param energy the energy gained by eating the food
	 */
	public Food(int size, int energy) {
		this.SIZE = size;
		this.ENERGY = energy;
		this.COST = 0;
		this.fresh = 1;
		attributes = new boolean[6];
	}

	/**
	 * Create a food with a given size, energy, and cost and default values for
	 * the rest (see {@link #Food()} for those values).
	 * 
	 * @param size the amount of space required to store the food
	 * @param energy the energy gained by eating the food
	 * @param cost the price of the food
	 */
	public Food(int size, int energy, double cost) {
		this.SIZE = size;
		this.ENERGY = energy;
		this.COST = cost;
		this.fresh = 1;
		attributes = new boolean[6];
	}

	/**
	 * Create a food with a given size, energy, and cost and default values for
	 * the rest (see {@link #Food()} for those values).
	 * 
	 * @param size the amount of space required to store the food
	 * @param energy the energy gained by eating the food
	 * @param cost the price of the food
	 * @param att an array of attributes for the food (baked, boiled, shredded,
	 *            etc)
	 */
	public Food(int size, int energy, double cost, boolean[] att) {
		this.SIZE = size;
		this.ENERGY = energy;
		this.COST = cost;
		this.attributes = att;
	}

	/**
	 * Get the amount of space the food takes up.
	 * 
	 * @return the size of the food
	 */
	public int getSize() {
		return this.SIZE;
	}

	/**
	 * Get the energy gained by eating this food.
	 * 
	 * @return the energy gained by eating the food
	 */
	public int getEnergy() {
		return this.ENERGY;
	}

	/**
	 * Get the price of the food.
	 * 
	 * @return the price of the food
	 */
	public double getCost() {
		return this.COST;
	}

	/**
	 * Get the freshness of the food.
	 * 
	 * @return the amount of time until the food is no longer fresh
	 */
	public double getFreshness() {
		return this.fresh;
	}

	/**
	 * Change the amount of time until the food spoils.
	 * 
	 * @param d the new amount of time until the food spoils
	 */
	public void setFreshness(double d) {
		this.fresh = d;
	}

	/**
	 * Make the food age (bring it closer to expiring).
	 */
	public void age() {
		this.fresh --;
	}
}
