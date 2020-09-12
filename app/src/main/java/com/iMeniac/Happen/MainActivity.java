package com.iMeniac.Happen;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        setViewPager();
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_myactivity);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_message);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_settings);
    }
    private void setViewPager(){

        SectionPageAdapter sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        sectionPageAdapter.addFragment(new Fragment_Home(),"");
        sectionPageAdapter.addFragment(new Fragment_MyActivity(),"");
        sectionPageAdapter.addFragment(new Fragment_Chat(),"");
        sectionPageAdapter.addFragment(new Fragment_Settings(),"");

        viewPager.setAdapter(sectionPageAdapter);
    }
}





























