package kz.e16traning.coffeevan.IItem;

import java.util.Collections;
import java.util.List;

/**
 * Реализация сортировки,
 * по цене или занимаемому обьему.
 *
 */
public enum Sort {
    BY_COST,
    BY_VOLUME;

    public void sort(List<IItem> items) {
        if (this == BY_COST)
            Collections.sort(items, new SortByCost());
        else if (this == BY_VOLUME)
            Collections.sort(items, new SortByVolume());
    }
}
