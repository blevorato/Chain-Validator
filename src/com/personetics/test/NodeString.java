package com.personetics.test;

public class NodeString implements Node{

    String string ;

    public NodeString(String string) {
        this.string = string;
    }

    public NodeString() {
    }

    @Override
    public boolean hasDependency() {
        return string.length() == 1;
    }
}
