package com.projects.ur13l.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by ur13l on 21/01/15.
 */
public class LastLocationLoader extends DataLoader<Location>{
    private long mRunId;

    public LastLocationLoader(Context context, long runId) {
        super(context);
        mRunId = runId;
    }
    @Override
    public Location loadInBackground() {
        return RunManager.get(getContext()).getLastLocationForRun(mRunId);
    }
}
