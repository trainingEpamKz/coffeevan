package kz.e16traning.coffeevan.IItem;


import kz.e16traning.coffeevan.exceptions.CloneItemException;

/**
 * Типизирующий интерфейс
 * для товаров.
 *
 */
public interface IItem {

    /**
     * Полчить цену предмета.
     *
     * @return цена предмета
     */
    double getCost();

    /**
     * Полчить обьем занимаемый
     * предметом.
     *
     * @return обьем занимаемый предметом
     */
    int getVolume();

    /**
     * Получить клон предмета.
     *
     * @return клон предмета
     * @throws CloneItemException исключение при клонировании
     */
    IItem getClone() throws CloneItemException;

    /**
     * Увеличить срок годности.
     *
     * @param days минимальное кол-во
     *             дней
     */
    void increaseDateOfExpiry(int days);
}
