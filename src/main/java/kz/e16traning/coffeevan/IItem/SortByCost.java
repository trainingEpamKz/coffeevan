package kz.e16traning.coffeevan.IItem;

import java.util.Comparator;

/**
 * Компаратор для сортировки по цене.
 *
 */
public class SortByCost implements Comparator<IItem> {
    public int compare(IItem o1, IItem o2) {
        return ((Double) o1.getCost()).compareTo(o2.getCost());
    }
}
