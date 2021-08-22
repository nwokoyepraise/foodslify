package com.vendarustech.foodslify.LaunchScreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vendarustech.foodslify.R;

public class ThirdOnboardFragment extends Fragment {
    private Button next;
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_third_onboard, container, false);
        next = view.findViewById(R.id.bNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getActivity(), WelcomeActivity.class);
                startActivity(next);
                getActivity().finish();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}