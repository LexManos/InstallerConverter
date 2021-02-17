package uk.gemwire.installerconverter.util.exception;

public class CachingException extends RuntimeException {
    public CachingException(String message) {
        super(message);
    }

    public CachingException(String message, Throwable cause) {
        super(message, cause);
    }
}
