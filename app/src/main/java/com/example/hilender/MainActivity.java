package com.example.hilender;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tab1);
        viewPager=findViewById(R.id.viewpager_id);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        //floating button
        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //add fragment here

        adapter.AddFragment(new FragmentPhoto(),"Photo");
        adapter.AddFragment(new FragmentMusic(),"Music");
        adapter.AddFragment(new FragmentVideo(),"Video");
        adapter.AddFragment(new FragmentFile(),"File");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_image_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_music_video_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_videocam_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_insert_drive_file_black_24dp);




        //remove shadow action bar
        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);

    }
}
