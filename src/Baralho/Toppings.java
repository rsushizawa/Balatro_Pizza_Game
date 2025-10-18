package Balatro_Pizza_Game.src.Baralho;

public enum Toppings {
        DEUCE(2, "Oregano"),
        THREE(3, "Garlic"),
        FOUR(4, "Bell Peppers"),
        FIVE(5, "Basil Leaves"),
        SIX(6, "Onion"),
        SEVEN(7, "Tomatoes"),
        EIGHT(8, "Olives"),
        NINE(9, "Cheese"),
        TEN(10, "Mushrooms"),
        JACK(10, "Bacon"),
        QUEEN(10, "Ham"),
        KING(10, "Sausage"),
        ACE(11, "Olive Oil");


        private final int value;
        private final String name;

        private Toppings (int value, String name) {
            this.value = value;
            this.name = name;
        }
        public int getId() {
            return value;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }