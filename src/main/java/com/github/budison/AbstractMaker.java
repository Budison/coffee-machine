package com.github.budison;

/**
 * @author Kevin Nowak
 */
abstract class AbstractMaker implements Recipe {

    private CupFactory cupFactory = new CupFactoryImpl();

    protected Cup takeNewEmptyCup() {
        return cupFactory.getCup();
    }

    public void setCupFactory(CupFactory cupFactory) {
        this.cupFactory = cupFactory;
    }
}
