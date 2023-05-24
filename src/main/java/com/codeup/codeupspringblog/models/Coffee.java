package com.codeup.codeupspringblog.models;

public class Coffee {

    private String roast;
    private String origin;
    public Coffee() {
    }

    public Coffee(String roast) {
        this.roast = roast;
    }
    public Coffee(String roast, String origin){
        this.roast = roast;
        this.origin = origin;

    }
}
