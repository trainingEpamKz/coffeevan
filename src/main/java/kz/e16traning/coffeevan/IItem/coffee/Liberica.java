package kz.e16traning.coffeevan.IItem.coffee;

import java.util.Calendar;

/**
 * Описание сорта Либерика.
 *
 */
public class Liberica extends Coffee {
    private final static int FACTOR_OF_EXPIRY = 4;

    public Liberica(CoffeeCondition coffeeCondition,
                    CoffeeWrap coffeeWrap) {
        super(coffeeCondition, coffeeWrap);
    }

    @Override
    public void increaseDateOfExpiry(int days) {
        this.dateOfExpiry.add(Calendar.DAY_OF_YEAR, days * FACTOR_OF_EXPIRY);
    }
}
