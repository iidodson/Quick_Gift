package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RelationahipActivity extends Activity {
    private String relationship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationahip);
    }

    public void goBack(View v){
        this.finish();
    }

    public void getRelationship(View v){
        if(v.getId() == R.id.parent){
            relationship = "Parent";
        }

        else if(v.getId() == R.id.signifother){
            relationship = "Significant Other";
        }

        else if(v.getId() == R.id.sibling){
            relationship = "Sibling";
        }

        else if(v.getId() == R.id.friend){
            relationship = "Friend";
        }

        else if(v.getId() == R.id.other){
            relationship = "Other";
        }


        Intent myIntent = new Intent( this, EventsActivity.class );
        /*
        Bundle b = new Bundle();
        b.putString("NAME", name);
        myIntent.putExtras(b);*/
        startActivity(myIntent);
    }


}
