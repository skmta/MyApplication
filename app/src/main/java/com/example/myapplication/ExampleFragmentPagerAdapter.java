package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ExampleFragmentPagerAdapter extends FragmentPagerAdapter{
    public ExampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.newInstance(android.R.color.holo_blue_bright);
            case 1:
                return ExampleFragment.newInstance(android.R.color.holo_green_light);
            case 2:
                return ExampleFragment.newInstance(android.R.color.holo_red_dark);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "page" + (position + 1);
    }
}
