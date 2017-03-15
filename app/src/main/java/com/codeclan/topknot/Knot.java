package com.codeclan.topknot;


public class Knot {

    String name;
    String purpose;
    int routeToImage;

    public Knot(String name, String purpose, int routeToImage){
        this.name = name;
        this.purpose = purpose;
        this.routeToImage = routeToImage;

    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getDrawableReference() {
        return routeToImage;
    }

}
