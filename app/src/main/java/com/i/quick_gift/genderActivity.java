package com.i.quick_gift;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;



public class genderActivity extends Activity {

    private TextView gender_text;
    private String name;
    public int gender;
    //public static Profile genderProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        Intent myIntent = getIntent();
        Bundle b = myIntent.getExtras();
        name = b.getString("NAME");
        gender_text = (TextView) findViewById(R.id.forwhatgender);

        //name = ProfileNameActivity.profile.getName();
        //gender_text.setText(name);
    }

    public void goBack(View v){
        this.finish();
    }

    public void getGender(View v){
        if(v.getId() == R.id.female){
            gender = 0;
        }

        else if(v.getId() == R.id.male){
            gender = 1;
        }

        Intent myIntent = new Intent( this, RelationahipActivity.class );
        /*
        Bundle b = new Bundle();
        b.putString("NAME", name);
        myIntent.putExtras(b);*/
        startActivity(myIntent);
    }

}
