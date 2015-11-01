package com.i.quick_gift;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;



public class InterestActivity extends Activity {
    public static Profile profile;
    private String interest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
    }

    public void goBack(View v){
        this.finish();
    }

    public void getInterest(View v){
        if(v.getId() == R.id.tech){
            interest = "Technology";
        }

        else if(v.getId() == R.id.outdoors){
            interest = "Outdoors";
        }

        else if(v.getId() == R.id.sports){
            interest = "Sports";
        }

        else if(v.getId() == R.id.music){
            interest = "Music";
        }

        else if(v.getId() == R.id.cooking){
            interest = "Cooking";
        }

        Intent myIntent = new Intent( this, QuickGift.class );
        /*
        Bundle b = new Bundle();
        b.putString("NAME", name);
        myIntent.putExtras(b);*/
        startActivity(myIntent);
    }

}
