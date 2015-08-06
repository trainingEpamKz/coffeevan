package kz.e16traning.coffeevan.IItem.coffee;

import kz.e16traning.coffeevan.IItem.IItem;
import kz.e16traning.coffeevan.exceptions.CloneItemException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Абстрактный класс Кофе,
 * предок разных сортов.
 *
 */
public abstract class Coffee implements IItem, Cloneable {
    protected Calendar dateOfExpiry;
    private double cost;
    private int volume;
    private int volumeOfCoffee;
    private CoffeeCondition coffeeCondition;
    protected CoffeeWrap coffeeWrap;

    public Coffee(CoffeeCondition coffeeCondition, CoffeeWrap coffeeWrap) {
        this.coffeeCondition = coffeeCondition;
        this.coffeeWrap = coffeeWrap;
        this.cost = CoffeePrice.getPrice(this.getClass());
        this.volume = coffeeWrap.getVolume() + coffeeWrap.getVolumeOfWrap();
        this.volumeOfCoffee = coffeeWrap.getVolume();
        this.dateOfExpiry = new GregorianCalendar();
        this.dateOfExpiry.add(Calendar.DAY_OF_YEAR, 30);
    }


    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("( %8s, %7s, %7s: %4s %4s %6s %12s )",
                this.getClass().getSimpleName(),
                this.coffeeCondition, this.coffeeWrap,
                this.volumeOfCoffee, this.volume,
                this.cost, dateFormat.format(dateOfExpiry.getTime()));
    }

    @Override
    public IItem getClone() throws CloneItemException {
        try {
            return this.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneItemException("Cant clone goods");
        }
    }

    @Override
    public IItem clone() throws CloneNotSupportedException {
        return (IItem) super.clone();
    }

}
