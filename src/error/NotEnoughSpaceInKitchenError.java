package error;

public class NotEnoughSpaceInKitchenError extends RuntimeException {
	public NotEnoughSpaceInKitchenError() {
		super();
	}

	public NotEnoughSpaceInKitchenError(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NotEnoughSpaceInKitchenError(String message, Throwable cause) {
		super(message, cause);
	}

	public NotEnoughSpaceInKitchenError(String message) {
		super(message);
	}

	public NotEnoughSpaceInKitchenError(Throwable cause) {
		super(cause);
	}
}
