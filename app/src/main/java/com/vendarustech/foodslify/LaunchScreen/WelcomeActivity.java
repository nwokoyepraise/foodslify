package com.vendarustech.foodslify.LaunchScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vendarustech.foodslify.BuyerModule.Accounts.Registration.RegActivity;
import com.vendarustech.foodslify.R;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mBuyFood, mSellFood;
    private Button mContinue;
    private TextView buyFood;
    private TextView sellFood;
    private String TAG = "TAG";
    private int userType = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initialize();
    }

    private void initialize() {
        buyFood = findViewById(R.id.tvBuyFood);
        sellFood = findViewById(R.id.tvSellFood);
        mBuyFood = findViewById(R.id.ivBuyFood);
        mSellFood = findViewById(R.id.ivSellFood);
        mContinue = findViewById(R.id.bContinue);
        buyFood.setOnClickListener(this);
        sellFood.setOnClickListener(this);
        mContinue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tvBuyFood) {
            mBuyFood.setVisibility(View.VISIBLE);
            mSellFood.setVisibility(View.INVISIBLE);
            userType = 0;
        } else if (v.getId() == R.id.tvSellFood) {
            mSellFood.setVisibility(View.VISIBLE);
            mBuyFood.setVisibility(View.INVISIBLE);
            userType = 1;
        } else if (v.getId() == R.id.bContinue){
            Intent reg;
            switch (userType){
                case 0:
                    reg = new Intent(WelcomeActivity.this, RegActivity.class);
                    startActivity(reg);
                    //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;

                case 1:
                    reg = new Intent(WelcomeActivity.this, com.vendarustech.foodslify.VendorModule.Accounts.Registration.RegActivity.class);
                    startActivity(reg);
                    //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;

                default:
                    Toast.makeText(this, "Please select user type!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

}