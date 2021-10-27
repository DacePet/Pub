package com.company;
import java.text.SimpleDateFormat;
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








        System.out.println("Sorry, but during lockdown until 15/11/2021 our bar is closed.");
   // public static void (String[] args) {
     //System.out.println(computeCost(ONE_BEER,true,10));

    }

   // public static int computeCost(SimpleBeverage menu, boolean student, int amount) {


    // }




        }
//if (amount>2)
  //  throw new RuntimeException("Too many drinks, max 2.");
//return
  //  }

   // public interface Beverage {
     //   int getPrice();
       // boolean isAmountLimited();
         //       boolean isEligableForStudentDiscount();
   // }

