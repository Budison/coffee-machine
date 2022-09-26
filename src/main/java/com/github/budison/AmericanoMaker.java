package com.github.budison;

/**
 * @author Kevin Nowak
 */
class AmericanoMaker extends AbstractMaker {

    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        cup.add("water");
        return cup;
    }
}
