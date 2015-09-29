package com.app.countdowntodolist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
 
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
 
    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                return new MainList_Fragment();
            case 1:
                return new Location_Fragment();
            case 2:
                return new User_Fragment();
            default:
                return new MainList_Fragment();
        }
    }
 
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}