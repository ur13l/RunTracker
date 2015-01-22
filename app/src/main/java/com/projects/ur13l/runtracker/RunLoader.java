package com.projects.ur13l.runtracker;

import android.content.Context;

/**
 * Created by ur13l on 21/01/15.
 */
public class RunLoader extends DataLoader<Run> {
    private long mRunId;

    public RunLoader(Context context, long runId) {
        super(context);
        mRunId = runId;
    }

    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(mRunId);
    }
}
