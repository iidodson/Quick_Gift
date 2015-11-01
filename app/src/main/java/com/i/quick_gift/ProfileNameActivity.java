package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class ProfileNameActivity extends Activity {
    private EditText name_text;
    private Button go;
    private String name;
    public static Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_name);
        name_text = (EditText) findViewById(R.id.profile_name);

        TextChangeHandler tch = new TextChangeHandler( );
        name_text.addTextChangedListener( tch );

        name  = name_text.getText().toString();

        profile = new Profile();
        profile.setName(name);
        //genderActivity.genderProfile.setName(name);
    }

    private class TextChangeHandler implements TextWatcher {
        public void afterTextChanged( Editable e ) {

            go = (Button)findViewById(R.id.go);
            if(name != null) {
                go.setText("Let's go ✓");
            }
        }
        public void beforeTextChanged( CharSequence s, int start,
                                       int count, int after ) {
        }
        public void onTextChanged( CharSequence s, int start,
                                   int before, int after ) {
        }
    }


    public void gotoGender(View v){
        if(name != null){
            Intent myIntent = new Intent( this, genderActivity.class );
            Bundle b = new Bundle();
            b.putString("NAME", name);
            myIntent.putExtras(b);
            startActivity(myIntent);
        }

    }

    public void goBack(View v){
        this.finish();
    }

}
