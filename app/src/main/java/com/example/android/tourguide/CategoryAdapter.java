package com.example.android.tourguide;

import android.content.Context;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);

        mContext = context;

    }


    @Override

    public Fragment getItem(int position) {

        if (position == 0) {

            return new PlaceFragment();

        } else if (position == 1) {

            return new RestaurantFragment();

        } else if (position == 2) {

            return new TempleFragment();

        } else {

            return new MallsFragment();

        }

    }


    @Override

    public int getCount() {

        return 4;

    }


    @Override

    public CharSequence getPageTitle(int position) {

        if (position == 0) {

            return mContext.getString(R.string.tourist_places);

        } else if (position == 1) {

            return mContext.getString(R.string.restaurants);

        } else if (position == 2) {

            return mContext.getString(R.string.temples);

        } else {

            return mContext.getString(R.string.malls);

        }

    }

}
