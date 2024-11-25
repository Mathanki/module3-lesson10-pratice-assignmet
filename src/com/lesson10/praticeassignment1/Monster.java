package com.lesson10.praticeassignment1;

public abstract class Monster {
    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    public abstract String attack();
}
