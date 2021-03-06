package com.i.quick_gift;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void onSignUpClick (View v){
        if(v.getId() == R.id.Bsignup){
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email = (EditText) findViewById(R.id.tfEmail);
            EditText uname = (EditText) findViewById(R.id.Tfuname);
            EditText pass1 = (EditText) findViewById(R.id.TFpass1);
            EditText pass2 = (EditText) findViewById(R.id.TFpass2);

            String nameStr = name.getText().toString();
            String emailStr = email.getText().toString();
            String unameStr = uname.getText().toString();
            String pass1Str = pass1.getText().toString();
            String pass2Str = pass2.getText().toString();

            if(!pass1Str.equals(pass2Str)){
                Toast pass = Toast.makeText(this,"Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
            else{
                Contact c = new Contact();
                c.setName(nameStr);
                c.setEmail(emailStr);
                c.setUname(unameStr);
                c.setPass(pass1Str);
                helper.insertContact(c);
                this.finish();
            }
        }
    }

}
