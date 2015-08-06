package kz.e16traning.coffeevan.IItem.coffee;

/**
 * Упаковка кофе.
 *
 */
public enum CoffeeWrap {
    GLASS (20, 5),
    PLASTIC (8, 2);

    private final int volume;
    private final int wrapVolume;

    CoffeeWrap(int volume, int wrapVolume) {
        this.volume = volume;
        this.wrapVolume = wrapVolume;
    }

    /**
     * Возвращает объем самой упаковки.
     *
     * @return обьем самой упаковки
     */
    public int getVolumeOfWrap() {
        return this.wrapVolume;
    }

    /**
     * Возвращает объем для кофе.
     *
     * @return обьем для кофе
     */
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
}
