package kz.e16traning.coffeevan.exceptions;

/**
 * Исключение при передаче
 * нуля или отрицательного значения
 *
 */

public class InputValuesZeroOrNegativeException extends ProjectMainException {
    public InputValuesZeroOrNegativeException(String message) {
        super(message);
    }
}
