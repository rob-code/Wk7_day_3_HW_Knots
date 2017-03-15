package com.codeclan.topknot;

        import org.junit.Test;

        import java.util.ArrayList;

        import static org.junit.Assert.*;


public class TopKnotTest {

    KnotList knots;
    ArrayList<Knot> list;


    @Test
    public void getListTest() {
        KnotList knots = new KnotList();
        list = knots.getList();

        assertEquals(13, knots.getList().size());

        for(Knot knot: list) {
            System.out.println(knot.getName() + ":  " + knot.getPurpose());
        }
    }


}
