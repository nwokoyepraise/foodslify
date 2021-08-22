package com.vendarustech.foodslify.BuyerModule.Dashboard;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.vendarustech.foodslify.R;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.Toolbar;

import com.vendarustech.foodslify.BuyerModule.Dashboard.ui.main.SectionsPagerAdapter;

public class DashboardActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener, View.OnClickListener, View.OnLongClickListener {
    private TabLayout tabLayout;
    private RelativeLayout mItem1, mItem2, mItem3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyer_dashboard_activity);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout = findViewById(R.id.tlTabs);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            View tab = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(0, 0, getResources().getDimensionPixelSize(R.dimen.tab_margin), 0);
            tab.requestLayout();
        }
        setUpToolbar();
        initialize();
    }

    private void initialize() {
       /* mItem1 = findViewById(R.id.rlItem);
        mItem2 = findViewById(R.id.rlItem2);
        mItem3 = findViewById(R.id.rlItem3);
        mItem1.setOnLongClickListener(this);
        mItem2.setOnLongClickListener(this);
        mItem3.setOnLongClickListener(this);
        mItem3.setOnLongClickListener(this);*/
        tabLayout.addOnTabSelectedListener(this);
    }

    private void setUpToolbar() {
        Toolbar toolbar = findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onClick(View v) {
        /*int id = v.getId();
        if (id == R.id.rlItem3) {
            Intent foodView = new Intent(DashboardActivity.this, FoodViewActivity.class);
            startActivity(foodView);
        }*/
    }

    @Override
    public boolean onLongClick(View v) {
        /*int id = v.getId();
        if (id == R.id.rlItem){

        }
        return true;
    }*/
        return false;
    }
}