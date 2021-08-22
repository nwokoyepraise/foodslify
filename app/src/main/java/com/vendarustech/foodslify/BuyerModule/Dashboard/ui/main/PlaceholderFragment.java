package com.vendarustech.foodslify.BuyerModule.Dashboard.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.vendarustech.foodslify.BuyerModule.Dashboard.DashboardActivity;
import com.vendarustech.foodslify.BuyerModule.Dashboard.FoodViewActivity;
import com.vendarustech.foodslify.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment implements View.OnClickListener, View.OnLongClickListener{

    private static final String ARG_SECTION_NUMBER = "section_number";
    private RelativeLayout mItem1,mItem2, mItem3;
    private ImageView check1, check2, check3;

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        initialize(root);
        return root;
    }

    private void initialize(View view) {
        mItem1 = view.findViewById(R.id.rlItem);
        mItem2 = view.findViewById(R.id.rlItem2);
        mItem3 = view.findViewById(R.id.rlItem3);
        check1 = view.findViewById(R.id.ivCheck);
        check2 = view.findViewById(R.id.ivCheck2);
        check3 = view.findViewById(R.id.ivCheck3);
        mItem3.setOnClickListener(this);
        mItem1.setOnLongClickListener(this);
        mItem2.setOnLongClickListener(this);
        mItem3.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.rlItem3) {
            Intent foodView = new Intent(getActivity(), FoodViewActivity.class);
            startActivity(foodView);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        int id = v.getId();
        if (id == R.id.rlItem){
            if(check1.getVisibility() == View.INVISIBLE) {
                check1.setVisibility(View.VISIBLE);
            } else{
                check1.setVisibility(View.INVISIBLE);
            }
        }
        else if (id == R.id.rlItem2){
            if(check2.getVisibility() == View.INVISIBLE) {
                check2.setVisibility(View.VISIBLE);
            } else{
                check2.setVisibility(View.INVISIBLE);
            }
        }
        else if (id == R.id.rlItem3){
            if(check3.getVisibility() == View.INVISIBLE) {
                check3.setVisibility(View.VISIBLE);
            } else{
                check1.setVisibility(View.INVISIBLE);
            }
        }
        return true;
    }
}