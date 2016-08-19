package com.cleveroad.testrecycler.ui.fragments.full_info_fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.cleveroad.testrecycler.models.SportCardModel;
import com.cleveroad.testrecycler.ui.fragments.full_info_inner_fragment.FullInfoInnerFragment;

public class CardsInfoAdapter extends FragmentStatePagerAdapter {

    private SportCardModel sportCardModel;
    private String[] titles = {"MEN", "WOMEN", "ATHLETES"};

    public CardsInfoAdapter(FragmentManager fm, SportCardModel sportCardModel) {
        super(fm);
        this.sportCardModel = sportCardModel;
    }

    @Override
    public Fragment getItem(int position) {
        return FullInfoInnerFragment.newInstance(sportCardModel);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}