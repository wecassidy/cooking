package error;

public class NoNextFurnishingIDError extends RuntimeException {
	public NoNextFurnishingIDError() {
		super();
	}

	public NoNextFurnishingIDError(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoNextFurnishingIDError(String message, Throwable cause) {
		super(message, cause);
	}

	public NoNextFurnishingIDError(String message) {
		super(message);
	}

	public NoNextFurnishingIDError(Throwable cause) {
		super(cause);
	}
}
