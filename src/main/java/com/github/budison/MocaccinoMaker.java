package com.github.budison;

/**
 * @author Kevin Nowak
 */
class MocaccinoMaker extends AbstractMaker {

    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        cup.add("milk");
        cup.add("milk");
        cup.add("foam");
        cup.add("chocolate");
        return cup;
    }
}
