package com.example.fragments;

import android.os.Bundle;

import com.example.fragments.fragments.AtyaFragment;
import com.example.fragments.fragments.FarajFragment;
import com.example.fragments.fragments.MatinFragment;
import com.example.fragments.fragments.OrignalEbra;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> names = new ArrayList();
        ArrayList<Fragment> fragments = new ArrayList();

        //TODO every add you'r fragment & name like above

        fragments.add(new FarajFragment());
        names.add("Faraj");

        fragments.add(new AtyaFragment());
        names.add("Ebra Atya");

        fragments.add(new OrignalEbra());
        names.add("Orig_Ebra");

        fragments.add(new MatinFragment());
        names.add("Matin");

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), fragments, names);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}