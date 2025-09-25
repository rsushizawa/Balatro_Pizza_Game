package Balatro_Pizza_Game.Baralho;

public enum Toppings {
        CHEESE(0, "Cheese"),
        PEPPERONI(1, "Pepperoni"),
        GREEN_OLIVES(2, "Green Olives"),
        CHICKEN(3, "Chicken"),
        MUSHROOMS(4, "Mushrooms"),
        ONIONS(5, "Onions"),
        BACON(6, "Bacon"),
        OREGANO(7, "Oregano"),
        PEPPERS(8, "Peppers"),
        PINEAPPLE(9, "Pineapple"),
        BLACK_OLIVES(10, "Black Olives"),
        SAUSAGE(11, "Sausage"),
        SPINACH(12, "Spinach"),
        BELL_PEPPERS(13, "Bell Peppers");


        private final int id;
        private final String name;

        private Toppings (int id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }

    }