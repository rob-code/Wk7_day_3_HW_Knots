package com.codeclan.topknot;

import java.util.ArrayList;

public class KnotList {

private ArrayList<Knot> list;

    public KnotList(){

        list = new ArrayList<Knot>();
        list.add(new Knot("Reef Knot", "Tying the reefs of sails", R.drawable.reef));
        list.add(new Knot("Sheep Shank", "A kind of a block and tackle", R.drawable.sheepshank));
        list.add(new Knot("Sheet Bend", "Joins 2 ropes", R.drawable.sheetbend));
        list.add(new Knot("Figure of 8 Knot", "A stopper at the end of a rope", R.drawable.fig8_));
        list.add(new Knot("Slip Knot", "Let something go quickly!", R.drawable.slip));
        list.add(new Knot("Noose", "Make a loop in a rope", R.drawable.noose));
        list.add(new Knot("Bowline", "Make a better loop in the end of a rope", R.drawable.bowline));
        list.add(new Knot("Round Turn and Two Half Hitches", "Quick know for securing a line to a post", R.drawable.roundturn));
        list.add(new Knot("Carrick Bend", "Strong way of attached two ropes of equal size", R.drawable.carrick));
        list.add(new Knot("Rolling Hitch", "Take the load of a loaded rope", R.drawable.rollinghitch));
        list.add(new Knot("Clove Hitch", "Secure a line perpendicular to another", R.drawable.cloveend));
        list.add(new Knot("Double Fisherman's bend", "A fast and secure way to join two ropes", R.drawable.doublefishermans));
        list.add(new Knot("Figure of 8 bend", "Another fast and secure way to join two ropes", R.drawable.fig8join));
    }

    public ArrayList<Knot> getList(){
        return list;
    }

}
