package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToSignup(View v){
        if(v.getId() == R.id.Buttonsignup){
            Intent myIntent = new Intent( this, SignUp.class );
            startActivity(myIntent);
        }
    }
    public void goToProfile(View v ) {
        if(v.getId() == R.id.email_sign_in_button){
            EditText email = (EditText) findViewById(R.id.email);
            String emailStr = email.getText().toString();
            EditText pass = (EditText) findViewById(R.id.password);
            String passStr = pass.getText().toString();

            String password = helper.searchPass(emailStr);
            if (passStr.equals(password)) {
                Intent myIntent = new Intent(this, AddPersonActivity.class);
                startActivity(myIntent);
            }
            else{
                Toast pass1 = Toast.makeText(this,"Username and password don't match", Toast.LENGTH_SHORT);
                pass1.show();
            }
        }

    }

    protected void onRestart( ) {
        super.onRestart( );
    }

    protected void onResume( ) {
        super.onResume( );
    }

    protected void onPause( ) {
        super.onPause();
    }

    protected void onStop( ) {
        super.onStop();
    }

    protected void onDestroy( ) {
        super.onDestroy();
    }

}
