package com.company;

import com.company.Coctails;
//import com.company.SimpleBeverage;
import java.util.HashMap;

public class Menu {
    //  public enum menu {ONE_BEER, ONE_CIDER, PROPER_CIDER, GT, BACCARDI_SPECIAL}

    public static void main(String[] args) {
        SimpleBeverage ONE_BEER = new SimpleBeverage();
        SimpleBeverage ONE_CIDER = new SimpleBeverage();
        SimpleBeverage A_PROPER_CIDER = new SimpleBeverage();
        Coctails GT = new Coctails();
        Coctails BACARDI_SPECIAL = new Coctails();


        HashMap<SimpleBeverage, SimpleBeverage.Beverage> menu = new HashMap<>();
        HashMap<Coctails, Coctails.IngredientUnit> menu1 = new HashMap<>();


        menu.put(SimpleBeverage.Beverage.ONE_BEER);
        menu.put(SimpleBeverage.Beverage.ONE_CIDER);
        menu.put(SimpleBeverage.Beverage.PROPER_CIDER);
        menu1.put(GT, new Coctails.IngredientUnit()
                .withIngredient(Coctails.IngredientUnit.GIN)
                .withIngredient(Coctails.IngredientUnit.TONIC_WATER)
                .withIngredient(Coctails.IngredientUnit.GREEN_STUFF));
        menu1.put(BACARDI_SPECIAL, new Coctails.IngredientUnit()
                .withIngredient(Coctails.IngredientUnit.GIN, 0.5)
                .withIngredient(Coctails.IngredientUnit.RUM)
                .withIngredient(Coctails.IngredientUnit.GRENADINE)
                .withIngredient(Coctails.IngredientUnit.LIME_JUICE));

        //public static void main(String[] args) {
        //System.out.println(computeCost(BEER,true,10));
    }

}


//public static int computeCost(String drink, boolean student, int amount) {

//if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
//  throw new RuntimeException("Too many drinks, max 2.");

// ALREADY USED INFO DELETED FROM INITIAL CODE

//else {
//}
//   throw new RuntimeException("No such drink exists");
//}
//if (student && (drink == ONE_CIDER || drink == ONE_BEER || drink == A_PROPER_CIDER)) {
//  price = price - price/10;
//}
//return price*amount;
//}
//}