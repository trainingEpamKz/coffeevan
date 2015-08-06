package kz.e16traning.coffeevan.IItem;

import java.util.Comparator;

/**
 * Компаратор для сортировки по обьему.
 *
 */
public class SortByVolume implements Comparator<IItem> {
    public int compare(IItem o1, IItem o2) {
        return ((Integer) o1.getVolume()).compareTo(o2.getVolume());
    }
}
