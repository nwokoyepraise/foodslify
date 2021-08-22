package com.vendarustech.foodslify.AccountAccess.SignIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.vendarustech.foodslify.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView DHAA;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initialize();
    }

    private void initialize(){
        DHAA = findViewById(R.id.tvDHAAAction);
        DHAA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tvDHAAAction) {
            finish();
        }
    }
}