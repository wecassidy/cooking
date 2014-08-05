package run;


public class IDManager {
	private static long nextFurnishingID = 0L;

	public static long assignFurnishingID() {
		nextFurnishingID ++;
		return nextFurnishingID --;
	}
}
