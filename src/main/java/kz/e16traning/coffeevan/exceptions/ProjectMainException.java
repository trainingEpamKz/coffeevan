package kz.e16traning.coffeevan.exceptions;

/**
 * Предок для всех исключений проекта.
 *
 */
public class ProjectMainException
        extends Exception {
    public ProjectMainException(String message) {
        super("Houston, we have a problem: " + message);
    }
}
