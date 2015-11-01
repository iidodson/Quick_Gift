package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class  EventsActivity extends Activity {
    private String event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void goBack(View v){
        this.finish();
    }

    public void getEvent(View v){
        if(v.getId() == R.id.christmas){
            event = "Christmas";
        }

        else if(v.getId() == R.id.valentines){
            event = "Valentines Day";
        }

        else if(v.getId() == R.id.parentsday){
            //case for female only
            event = "Mother's Day";
        }

        else if(v.getId() == R.id.birthday){
            event = "Birthday";
        }

        else if(v.getId() == R.id.anniversary){
            event = "Anniversary";
        }

        Intent myIntent = new Intent( this, InterestActivity.class );
        /*
        Bundle b = new Bundle();
        b.putString("NAME", name);
        myIntent.putExtras(b);*/
        startActivity(myIntent);

    }
}
