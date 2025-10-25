package Order;

import Baralho.Toppings;

import java.util.*;

public class Pizza {
    private List<Toppings> toppings = new ArrayList<>();
    private int base_chips = 0;

    public Pizza(List<Toppings> toppings) {
        this.toppings.addAll(toppings);
        for(Toppings topping : toppings) {
            this.base_chips += topping.getId();
        }
    }

    public void addTopping(Toppings topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(Toppings topping) {
        this.toppings.remove(topping);
    }

    public List<Toppings> getToppings() {
        return new ArrayList<>(toppings);
    }
}
