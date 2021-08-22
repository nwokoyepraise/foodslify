package com.vendarustech.foodslify.VendorModule.Accounts.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vendarustech.foodslify.AccountAccess.SignIn.SignInActivity;
import com.vendarustech.foodslify.R;
import com.vendarustech.foodslify.VendorModule.Dashboard.DashboardActivity;

public class RegActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView AHAA;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vendor_reg_activity);
        initialize();
    }

    private void initialize(){
        AHAA = findViewById(R.id.tvAHAAAction);
        signUp = findViewById(R.id.bSignUp);
        AHAA.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Log.i("jj", String.valueOf(id));
        if (id == R.id.tvAHAAAction) {
            Intent ahaa = new Intent(this, SignInActivity.class);
            startActivity(ahaa);
        }else if (id == R.id.bSignUp){
            Intent dashBoard = new Intent( this, DashboardActivity.class);
            startActivity(dashBoard);
        }
    }
}