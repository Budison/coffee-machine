package com.github.budison;

/**
 * @author Kevin Nowak
 */
class CappuccinoMaker extends AbstractMaker {

    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        cup.add("milk");
        cup.add("foam");
        return cup;
    }
}
