package kz.e16traning.coffeevan.IItem;

import kz.e16traning.coffeevan.exceptions.CloneItemException;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация поиска,
 * по цене или занимаемому обьему.
 *
 */
public enum Find {
    BY_COST,
    BY_VOLUME;

    private List<IItem> findItems = new ArrayList<>();

    private void findByCost(List<IItem> items,
                            double startCost, double endCost)
            throws CloneItemException {
        for (IItem item : items) {
            if (startCost <= item.getCost()
                    && endCost >= item.getCost()) {
                findItems.add(item.getClone());
            }
        }
    }

    private void findByVolume(List<IItem> items,
                              double startVolume, double endVolume)
            throws CloneItemException {
        for (IItem item : items) {
            if (startVolume <= item.getVolume()
                    && endVolume >= item.getVolume()) {
                findItems.add(item.getClone());
            }
        }
    }

    public List<IItem> find(List<IItem> items,
                            double startValue, double endValue)
            throws CloneItemException {
        findItems.clear();
        if (this == BY_COST) {
            findByCost(items, startValue, endValue);
        }
        else if (this == BY_VOLUME)
        {
            findByVolume(items, startValue, endValue);
        }
        return findItems;
    }

    @Override
    public String toString() {
        return name().substring(3).toLowerCase();
    }
}
