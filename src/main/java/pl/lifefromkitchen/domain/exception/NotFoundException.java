package pl.lifefromkitchen.domain.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(final String message) {
        super(message);
    }
}
