package run;

public class IDManager {
	private static long nextFurnishingID = 0L;
	private static long nextItemID = 0L;

	public static long assignFurnishingID() {
		nextFurnishingID ++;
		return nextFurnishingID --;
	}

	public static long assignItemID() {
		nextItemID ++;
		return nextItemID --;
	}
}
