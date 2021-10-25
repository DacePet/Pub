package com.company;

public class Coctails {
    public enum IngredientUnit {
        GIN(85), TONIC_WATER(20), GREEN_STUFF(10), RUM(65), GRENADINE(10), LIME_JUICE(10);

        public int price;

        IngredientUnit(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}

