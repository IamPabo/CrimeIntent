package com.android.criminalintent.activity;

import android.support.v4.app.Fragment;

import com.android.criminalintent.fragment.CrimeListFragment;
import com.android.criminalintent.fragment.SingleFragmentActivity;

/**
 * Created by 刘老爷 on 2016/10/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
