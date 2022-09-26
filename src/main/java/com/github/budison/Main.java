package com.github.budison;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setMakersMap(setUp());
        System.out.println(coffeeMachine.processRequest("AMERICANO"));
        System.out.println(coffeeMachine.processRequest("ESPRESSO"));
        System.out.println(coffeeMachine.processRequest("LATTE"));

        try {
            System.out.println(coffeeMachine.processRequest("TEA"));
        } catch (RuntimeException e) {
            System.err.println("THIS MACHINE DOES NOT SERVE TEA!");
        }
    }

    private static Map<String, Recipe> setUp() {
        Map<String, Recipe> makersMap = new HashMap<>();
        makersMap.put("AMERICANO", new AmericanoMaker());
        makersMap.put("ESPRESSO", new EspressoMaker());
        makersMap.put("LATTE", new LatteMaker());
        makersMap.put("CAPPUCCINO", new CappuccinoMaker());
        return makersMap;
    }
}