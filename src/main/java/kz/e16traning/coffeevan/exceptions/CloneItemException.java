package kz.e16traning.coffeevan.exceptions;

/**
 * Ошибка при клонировании.
 *
 */
public class CloneItemException extends ProjectMainException {
    public CloneItemException(String message) {
        super(message);
    }
}
