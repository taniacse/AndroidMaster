package com.tania.androidmaster.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tania.androidmaster.main.fragment.FragmentAdvance;
import com.tania.androidmaster.main.fragment.BasicFragment;

/**
 * Created by User on 2/25/2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    int mNumOfTabs;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BasicFragment tab1 = new BasicFragment();
                return tab1;
            case 1:
                FragmentAdvance tab2 = new FragmentAdvance();
                return tab2;

            case 2:
                FragmentAdvance tab3 = new FragmentAdvance();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
