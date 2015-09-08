package com.anas.snapshot;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Anas on 9/8/2015.
 */
public class SnapshotApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "jsOQpKlPPkPAIA1WSIvi2STrmsuxoVh9nwkSZslB", "gdgsQ4WQywtr9E8ZEq8N0M5r2gykvV3RJuSVIM1O");
    }
}
