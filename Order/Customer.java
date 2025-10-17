package Balatro_Pizza_Game.Order;
import Balatro_Pizza_Game.Baralho.Toppings;
import java.util.*;


public class Customer {


    Random rand = new Random();

    public static void main(String[] args) {
        List<Map<String, Object>> Customers = new ArrayList<>();

        Order order = new Order();
        PizzaType pizza;


        int limit =7;

            for (int i = 0 ; i < limit ; i++){
                pizza = order.getRandomPizza();
                Map<String, Object> Customer = new HashMap<>();
                Customer.put("id", i);
                Customer.put("Pizza Order", pizza.getNome());
                Customers.add(Customer);
            }
            for (Map<String, Object> customer : Customers) {
                System.out.println(customer);
            }

    }
}
