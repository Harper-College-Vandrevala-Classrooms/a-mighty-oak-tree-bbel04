package com.csc;

public class Squirrel implements Comparable<Squirrel>{
    private String name;

    Squirrel(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Squirrel other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
