package com.tanapakorlaop.fragmentcontrol;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tanapakor.laop on 24/8/2558.
 */
public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0) {
            return new FirstFragment();
        } else if(i == 1) {
            return new SecondFragment();
        }else if(i == 2) {
            return new ThirdFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
