package com.personetics.test;

public class NodeNumber implements Node {
    int number ;
    public NodeNumber(int number) {
        this.number = number;
    }

    public NodeNumber() {
    }

    @Override
    public boolean hasDependency() {
        String numberInside = String.valueOf(number);
        return numberInside.length() == 1 ;
    }
}
