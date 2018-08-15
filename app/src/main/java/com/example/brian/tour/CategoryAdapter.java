package com.example.brian.tour;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;

import java.util.Locale;

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new ThemeFragment();
        } else if (position ==2) {
            return new BeachFragment();
        } else {
            return new MuseumFragment();
        }
    }

    //Return the total number of pages.
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.food);
        } else if (position == 1) {
            return mContext.getString(R.string.theme_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.beaches);
        } else {
            return mContext.getString(R.string.museums);
        }
    }
}
