package com.projects.ur13l.runtracker;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by ur13l on 21/01/15.
 */
public abstract class DataLoader<D> extends AsyncTaskLoader<D> {
    private D mData;

    public DataLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        if (mData != null) {
            deliverResult(mData);
        }else {
            forceLoad();
        }
    }

    @Override
    public void deliverResult(D data) {
        int a =2;
        if (isStarted())
            super.deliverResult(data);
    }
}
