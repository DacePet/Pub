package com.company;

public class SimpleBeverage {
    public enum Beverage {
        ONE_BEER(74), ONE_CIDER(103), PROPER_CIDER(110);

        public int price;
        Beverage(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
        }
}
        //public String name;
    //public int price;

    // public SimpleBeverage() {
    //}

   // public int SimpleBeverage(String name, Integer price) {

     //   this.name = name;
       // this.price = price;
    //}

    //public static void SimpleBeverage(String[] args) {
      //  SimpleBeverage ONE_BEER = new SimpleBeverage();
       // SimpleBeverage ONE_CIDER = new SimpleBeverage();
        //SimpleBeverage PROPER_CIDER = new SimpleBeverage();

   // }
//}