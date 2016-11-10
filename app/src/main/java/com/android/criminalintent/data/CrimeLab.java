package com.android.criminalintent.data;

import android.content.Context;

import com.android.criminalintent.tools.Crime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by abc on 2016/8/28.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;

    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
    }

    public List<Crime> getCrimes(){
        return  mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes){
            if (crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }
}