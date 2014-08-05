package entities.food;

public class Metadata {
	public boolean baked;
	public boolean boiled;
	public boolean breaded;
	public boolean broiled;
	public boolean cut;
	public boolean dried;
	public boolean fried;
	public boolean mashed;
	public boolean melted;
	/**
	 * <h1>This variable is not for mere mortals to understand, as it is
	 * considered an implementation detail.</h1>
	 */
	public boolean potato;
	public boolean regurgitated;
	public boolean shredded;
	public boolean stirred;
	public boolean toasted;

	public Metadata() {
		baked = false;
		boiled = false;
		breaded = false;
		broiled = false;
		cut = false;
		dried = false;
		mashed = false;
		melted = false;
		potato = false;
		regurgitated = false;
		shredded = false;
		stirred = false;
		toasted = false;
	}

	public Metadata(boolean baked, boolean boiled, boolean breaded,
			boolean broiled, boolean cut, boolean dried, boolean fried,
			boolean mashed, boolean melted, boolean potato,
			boolean regurgitated, boolean shredded, boolean stirred,
			boolean toasted) {
		this.baked = baked;
		this.boiled = boiled;
		this.breaded = breaded;
		this.broiled = broiled;
		this.cut = cut;
		this.dried = dried;
		this.fried = fried;
		this.mashed = mashed;
		this.melted = melted;
		this.potato = potato;
		this.regurgitated = regurgitated;
		this.shredded = shredded;
		this.stirred = stirred;
		this.toasted = toasted;
	}
}
