package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class QuickGift extends Activity {
    public static GiftModel gm = new GiftModel();
    GridView grid;
    String[] item = gm.genderArray(0, "Technology");
    int [] thumbnail = gm.thumbnailArray(0, "Technology");
    String [] description = gm.descriptionArray(0, "Technology");
    Double [] cheapest = gm.lowest(0,"Technology");
    String [] cheapStr = gm.lowStr;
    Double [] highest = gm.high;
    String [] highStr = gm.highStr;
    Double [] mid = gm.mid;
    String [] midStr = gm.midStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_gift);
        gm.description = description;
        gm.thumbnail = thumbnail;
        gm.low = cheapest;
        gm.lowStr = cheapStr;
        gm.high = highest;
        gm.highStr = highStr;
        gm.mid = mid;
        gm.midStr = midStr;


        CustomGrid adapter = new CustomGrid(this, item, thumbnail);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                gm.setDescription(gm.description[position]);
                gm.setImgID(gm.thumbnail[position]);
                gm.setPrice(gm.low[position]);
                gm.setPriceStr(gm.lowStr[position]);
                gm.setMprice(gm.mid[position]);
                gm.setMpStr(gm.midStr[position]);
                gm.setHprice(gm.high[position]);
                gm.setHpStr(gm.highStr[position]);
                Intent myIntent = new Intent( getApplicationContext(), GiftDetails.class );
                startActivity(myIntent);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quick_gift, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}