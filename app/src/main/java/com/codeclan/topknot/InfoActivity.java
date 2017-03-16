package com.codeclan.topknot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView knotText;
    KnotList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        knotText = (TextView)findViewById(R.id.info_text);

        String knotInfo = extras.getString("knot_selected");
        knotText.setText(knotInfo);


    }
}
