package com.company;
import java.util.HashMap;

public class Menu {

    public static void main(String[] args) {
        SimpleBeverage ONE_BEER = new SimpleBeverage();
        SimpleBeverage ONE_CIDER = new SimpleBeverage();
        SimpleBeverage A_PROPER_CIDER = new SimpleBeverage();
        Coctails GT = new Coctails();
        Coctails BACARDI_SPECIAL = new Coctails();


        HashMap<SimpleBeverage, SimpleBeverage.Beverage> menu = new HashMap<>();
        HashMap<Coctails, Coctails.CoctailsPrice> menu1 = new HashMap<>();


        menu.put(ONE_BEER, SimpleBeverage.Beverage.ONE_BEER);
        menu.put(ONE_CIDER, SimpleBeverage.Beverage.ONE_CIDER);
        menu.put(A_PROPER_CIDER, SimpleBeverage.Beverage.PROPER_CIDER);
        menu1.put(GT, Coctails.CoctailsPrice.GT);
        menu1.put(BACARDI_SPECIAL, Coctails.CoctailsPrice.BACARDI_SPECIAL);



        //public static void main(String[] args) {
        //System.out.println(computeCost(BEER,true,10));
        ///
    }

}