package com.i.quick_gift;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Travon on 10/31/2015.
 */

public class CustomGrid extends BaseAdapter{
    private Context context;
    private final String[] itemName;
    private final int[] imageId;

    public CustomGrid(Context c,String[] name,int [] id ) {
        context = c;
        imageId = id;
        itemName = name;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return itemName.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(context);
            grid = inflater.inflate(R.layout.single_grid, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(itemName[position]);
            imageView.setImageResource(imageId[position]);
        } else {
            grid = convertView;
        }

        return grid;
    }
}