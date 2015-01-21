package com.projects.ur13l.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by ur13l on 19/01/15.
 */
public class TrackingLocationReceiver extends LocationReceiver{

    @Override
    protected void onLocationReceived(Context c, Location loc) {
        RunManager.get(c).insertLocation(loc);
    }
}
