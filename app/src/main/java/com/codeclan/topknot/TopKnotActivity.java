package com.codeclan.topknot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class TopKnotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knots_list);

        KnotList knotList = new KnotList();
        ArrayList<Knot> list = knotList.getList();

        TopKnotAdapter knotAdapter = new TopKnotAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(knotAdapter);
    }

    public void titleClicked(View textView){


        //I got lucky with the name of the knot!
        //Android grabs the string from that instance!
        //Had I clicked from the description I would have got that too,
        //which is what happens!
        TextView title = (TextView) textView;

        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("knot_selected", title.getText().toString());
        startActivity(intent);
    }



}
