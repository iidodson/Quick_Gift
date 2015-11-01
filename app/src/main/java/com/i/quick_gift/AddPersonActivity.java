package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddPersonActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
    }

    public void goToName(View v ) {
        Intent myIntent = new Intent( this, ProfileNameActivity.class );
        startActivity(myIntent);
    }
}
