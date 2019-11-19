package edu.ivytech.crimetrackerdemo;

import android.content.Context;

/* !!!!!For recycler view!!!!! */

public class CrimeLab {

    public static CrimeLab sCrimeLab;

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

    }

}
