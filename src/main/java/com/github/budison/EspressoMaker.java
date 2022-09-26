package com.github.budison;

/**
 * @author Kevin Nowak
 */
class EspressoMaker extends AbstractMaker {

    @Override
    public Cup make() {
        Cup cup = takeNewEmptyCup();
        cup.add("espresso");
        return cup;
    }
}
