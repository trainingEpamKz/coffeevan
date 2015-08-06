package kz.e16traning.coffeevan;

import kz.e16traning.coffeevan.IItem.Find;
import kz.e16traning.coffeevan.IItem.Sort;
import kz.e16traning.coffeevan.controller.Controller;
import kz.e16traning.coffeevan.exceptions.ProjectMainException;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Controller ctrl = new Controller(1000, 1000);
            ctrl.fillStorage();
            ctrl.outputStorage();
            ctrl.upVolumeOfStorage(1000);
            ctrl.fillStorage();
            ctrl.outputStorage();
            ctrl.increaseDateOfExpiry(5);
            ctrl.outputStorage();
            ctrl.sort(Sort.BY_COST);
            ctrl.outputStorage();
            ctrl.find(Find.BY_COST, 2, 4);
        } catch (ProjectMainException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
