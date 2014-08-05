package error;

public class NoSuchFurnishingIDError extends RuntimeException {
	public NoSuchFurnishingIDError() {
		super();
	}

	public NoSuchFurnishingIDError(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoSuchFurnishingIDError(String message, Throwable cause) {
		super(message, cause);
	}

	public NoSuchFurnishingIDError(String message) {
		super(message);
	}

	public NoSuchFurnishingIDError(Throwable cause) {
		super(cause);
	}
}
