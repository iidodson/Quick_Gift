package com.i.quick_gift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogin(View v ) {
        Intent myIntent = new Intent( this, LoginActivity.class );
        startActivity(myIntent);
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

