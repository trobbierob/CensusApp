package com.example.android.censusapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragManager = getSupportFragmentManager();

        Fragment theFragment = fragManager.findFragmentById(R.id.fragmentContainer);

        if(theFragment == null){
            theFragment = new ContactFragment();

            fragManager.beginTransaction()
                    .add(R.id.fragmentContainer, theFragment).commit();
        }
    }
}
