package com.projects.ur13l.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by ur13l on 19/01/15.
 */
public class RunListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return new RunListFragment();
    }
}
