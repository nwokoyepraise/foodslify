package com.vendarustech.foodslify.BuyerModule.Dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vendarustech.foodslify.R;

/*
*
 * A simple {@link Fragment} subclass.
 * Use the {@link VendorDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
*/
public class VendorDetailsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vendor_details, container, false);
    }
}