package Order;

import Baralho.Toppings;

import java.util.*;

public class Pizza {
    private EnumSet<Toppings> toppings;
    private int base_chips = 0;

    public Pizza(List<Toppings> toppings) {
        for(Toppings topping : toppings) {
            this.toppings.add(topping);
            this.base_chips += topping.getId();
        }
    }

    public PizzaType verifyPizza(Pizza pizza){
        List<PizzaType> pizzaType =  new ArrayList<>(Arrays.asList(PizzaType.values()));
        Collections.sort(pizza.getToppings());
        for(PizzaType type : pizzaType) {
            Collections.sort(type.getToppings());
            if(pizza.getToppings().equals(type.getToppings())) {
                return type;
            }
        }
        return null;
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
