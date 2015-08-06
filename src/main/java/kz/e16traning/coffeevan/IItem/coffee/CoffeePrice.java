package kz.e16traning.coffeevan.IItem.coffee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Цены на кофе подгружаются из файла.
 *
 */
public class CoffeePrice {
    private final static String SOURCE_PATH = "price.txt";
    private static Map<Class<? extends Coffee>, Double> price;
    private List<Class<? extends Coffee>> coffeeClasses;



    public CoffeePrice(List<Class<? extends Coffee>> coffeeClasses) {
        price = new HashMap<>();
        this.coffeeClasses = coffeeClasses;
        getPriceFromFile();
    }

    /**
     * Подгружает цены на кофе из файла,
     * если в процессе возникает исключение
     * загружаются значения по умолчанию.
     *
     */
    private void getPriceFromFile() {
        try {
            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream(SOURCE_PATH);
            properties.load(fis);
            for (Class<? extends Coffee> cClass : coffeeClasses) {
                price.put(cClass, Double.valueOf(
                        properties.getProperty(
                                cClass.getSimpleName())));
            }
        } catch (IOException e) {
            getDefaultPrice();
        }
    }

    private void getDefaultPrice() {
        for (int i = 0; i < coffeeClasses.size(); i++) {
            price.put(coffeeClasses.get(i), (double) (i + 2));
        }
    }

    public static double getPrice(Class<? extends Coffee> coffeeClass) {
        return price.get(coffeeClass);
    }

}
