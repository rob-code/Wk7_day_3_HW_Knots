package com.codeclan.topknot;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopKnotAdapter extends ArrayAdapter<Knot> {

    public TopKnotAdapter(Context context, ArrayList<Knot> knots) {

    super(context, 0, knots);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.knots_item,
                    parent,
                    false);
        }

        Knot currentKnot = getItem(position);

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        image.setImageResource(currentKnot.getDrawableReference());

        TextView title = (TextView)listItemView.findViewById(R.id.name);
        title.setText(currentKnot.getName());

        TextView year = (TextView)listItemView.findViewById(R.id.description);
        year.setText(currentKnot.getPurpose().toString());

        return listItemView;

    }


}



