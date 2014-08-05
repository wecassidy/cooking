package error;

public class OutOfStorageSpaceError extends RuntimeException {
	public OutOfStorageSpaceError() {
		super();
	}

	public OutOfStorageSpaceError(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OutOfStorageSpaceError(String message, Throwable cause) {
		super(message, cause);
	}

	public OutOfStorageSpaceError(String message) {
		super(message);
	}

	public OutOfStorageSpaceError(Throwable cause) {
		super(cause);
	}

}
