package com.github.budison;

import java.util.Arrays;

/**
 * @author Kevin Nowak
 */
class CupFactoryImpl implements CupFactory {

    @Override
    public Cup getCup() {
        Cup cup = new Cup();
        cup.setZeroIngredients(Arrays.asList("espresso", "water", "milk", "foam"));
        return cup;
    }
}
