package edu.ivytech.crimetrackerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fragman = getSupportFragmentManager();
        Fragment fragment = fragman.findFragmentById(R.id.fragment_container);

        if(fragment == null)
        {
            fragment = new CrimeFragment();
            fragman.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
