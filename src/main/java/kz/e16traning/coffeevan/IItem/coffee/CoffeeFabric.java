package kz.e16traning.coffeevan.IItem.coffee;


import java.util.List;
import java.util.Random;

/**
 * Генерация кофе
 *
 */
public class CoffeeFabric {
    private List<Class<? extends Coffee>> coffeeClasses;
    private static Random rand = new Random();

    public CoffeeFabric(List<Class<? extends Coffee>> coffeeClasses) {
        this.coffeeClasses = coffeeClasses;
    }

    public Coffee getRandomCoffee() {
        Class<? extends Coffee> cCoffee = coffeeClasses.get(rand.nextInt(coffeeClasses.size()));
        Coffee result;
        CoffeeCondition coffeeCondition = Enums.random(CoffeeCondition.class);
        CoffeeWrap coffeeWrap = Enums.random(CoffeeWrap.class);
        if (cCoffee.equals(Arabica.class)) result =
                new Arabica(coffeeCondition, coffeeWrap);
        else if (cCoffee.equals(Robusta.class)) result =
                new Robusta(coffeeCondition, coffeeWrap);
        else result = new Liberica(coffeeCondition, coffeeWrap);
        return result;
    }

    public static class Enums {
        public static <T extends Enum<T>> T random(Class<T> ec) {
            return random(ec.getEnumConstants());
        }
        public static <T> T random(T[] values) {
            return values[rand.nextInt(values.length)];
        }
    }
}
