package com.codeup.codeupspringblog.models;

public class Coffee {

    private String roast;

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getRoast() {
        return roast;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

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
