package com.lesson10.praticeassignment2;

public enum BookType {
    KIDS("Kids"),
    FICTION("Fiction");
    private  String name;
     BookType(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
