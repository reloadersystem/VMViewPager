package com.reloader.vmseparatorfragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    private static final int[] TABTITLES = new int[] {R.string.tab_text1, R.string.tab_text2};

    private final Context mContext;

    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position==0)
        {
            return FirstFragment.newInstance();
        }else{
            return SecondFragment.newInstance();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return mContext.getResources().getString(TABTITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
