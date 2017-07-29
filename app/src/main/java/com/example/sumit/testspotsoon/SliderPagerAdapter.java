package com.example.sumit.testspotsoon;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by sumit on 25/7/17.
 */



public class SliderPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public SliderPagerAdapter(FragmentManager fm, List<Fragment> fragments){

        super(fm);
        this.fragments=fragments;
    }
    @Override
    public Fragment getItem(int i) {
        return this.fragments.get(i);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }


}
