package com.vendarustech.foodslify.BuyerModule.Dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.vendarustech.foodslify.R;

public class FoodViewActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout flContainer;
    private TextView tvFoodDesc, tvVendorDetails, tvCombo;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_view);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        initialize();

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flContainer, new FoodDescFragment());
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tvDescription) {
            tvFoodDesc.setBackgroundResource(R.drawable.food_detail_selected);
            tvFoodDesc.setTextColor(getColor(R.color.main_orange));
            tvVendorDetails.setBackgroundResource(R.drawable.food_detail_background);
            tvVendorDetails.setTextColor(getColor(R.color.white));
            tvCombo.setBackgroundResource(R.drawable.food_detail_background);
            tvCombo.setTextColor(getColor(R.color.white));
            replaceFragment(new FoodDescFragment());

        } else if (id == R.id.tvVendorDetails) {
            tvFoodDesc.setBackgroundResource(R.drawable.food_detail_background);
            tvFoodDesc.setTextColor(getColor(R.color.white));
            tvVendorDetails.setBackgroundResource(R.drawable.food_detail_selected);
            tvVendorDetails.setTextColor(getColor(R.color.main_orange));
            tvCombo.setBackgroundResource(R.drawable.food_detail_background);
            tvCombo.setTextColor(getColor(R.color.white));
            replaceFragment(new VendorDetailsFragment());

        } else if (id == R.id.tvCombo) {
            tvVendorDetails.setBackgroundResource(R.drawable.food_detail_background);
            tvFoodDesc.setTextColor(getColor(R.color.white));
            tvFoodDesc.setBackgroundResource(R.drawable.food_detail_background);
            tvFoodDesc.setTextColor(getColor(R.color.white));
            tvCombo.setBackgroundResource(R.drawable.food_detail_selected);
            tvCombo.setTextColor(getColor(R.color.main_orange));
        }

    }


    private void initialize() {
        flContainer = findViewById(R.id.flContainer);
        tvFoodDesc = findViewById(R.id.tvDescription);
        tvVendorDetails = findViewById(R.id.tvVendorDetails);
        tvCombo = findViewById(R.id.tvCombo);
        tvCombo.setOnClickListener(this);
        tvVendorDetails.setOnClickListener(this);
        tvFoodDesc.setOnClickListener(this);
    }

    private void replaceFragment(Fragment fragment) {
        if (!fragment.isAdded()) {
            try {
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.flContainer, fragment);
                ft.addToBackStack(null);
                ft.commit();
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else {
            ft.show(fragment);
        }
    }
}