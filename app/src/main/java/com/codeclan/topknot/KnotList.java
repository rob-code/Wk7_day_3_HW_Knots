package com.codeclan.topknot;

import java.util.ArrayList;

public class KnotList {

private ArrayList<Knot> list;

    public KnotList(){

        list = new ArrayList<Knot>();
        list.add(new Knot("Reef Knot", "Tying the reefs of sails", R.drawable.bowline));
        list.add(new Knot("Half Hitch", "A stopper knot - but best not to use as it locks", R.drawable.bowline));
        list.add(new Knot("Sheet Bend", "Join 2 ropes", R.drawable.bowline));
        list.add(new Knot("Figure of 8 Knot", "A stopper at the end of a rope", R.drawable.bowline));
        list.add(new Knot("Slip Knot", "Let something go quickly", R.drawable.bowline));
        list.add(new Knot("Noose", "Make a loop in a rope", R.drawable.bowline));
        list.add(new Knot("Bowline", "Make a better loop in the end of a rope", R.drawable.bowline));
        list.add(new Knot("Bowline on a Bight", "Make a loop in the middle of a rope", R.drawable.bowline));
        list.add(new Knot("Running Bowline", "Makes a loop through which an end can run", R.drawable.bowline));
        list.add(new Knot("Round Turn and Two Half Hitches", "Quick know for securing a line to a post", R.drawable.bowline));
        list.add(new Knot("Carrick Bend", "Strong way of attached two ropes of equal size", R.drawable.bowline));
        list.add(new Knot("Single Sheet Bend", "A secure way of attached a thin rope to a thick loop", R.drawable.bowline));
        list.add(new Knot("Double Sheet Bend", "A better way of attaching a thin rope to a think loop", R.drawable.bowline));

    }

    public ArrayList<Knot> getList(){
        return list;
    }

}
