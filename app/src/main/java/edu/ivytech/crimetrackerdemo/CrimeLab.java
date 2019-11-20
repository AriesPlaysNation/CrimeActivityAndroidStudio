package edu.ivytech.crimetrackerdemo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* !!!!!For recycler view!!!!! */

public class CrimeLab {

    public static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context)
    {
        if(sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context)
    {
        mCrimes = new ArrayList<>();

        
    }

    public Crime getCrime(UUID id)
    {
        for(Crime crime : mCrimes)
        {
            if(crime.getmId().equals(id))
            {
                return crime;
            }
        }
        return null;
    }
}
