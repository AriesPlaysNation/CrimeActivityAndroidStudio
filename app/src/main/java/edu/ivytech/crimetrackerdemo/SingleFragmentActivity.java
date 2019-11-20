package edu.ivytech.crimetrackerdemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity
{
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fragman = getSupportFragmentManager();
        Fragment fragment = fragman.findFragmentById(R.id.fragment_container);

        if(fragment == null)
        {
            fragment = new CrimeFragment();
            fragman.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
