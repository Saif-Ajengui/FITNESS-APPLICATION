package com.example.salledesportapplication.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.salledesportapplication.GymPlanFragment;
import com.example.salledesportapplication.Progress;
import com.example.salledesportapplication.R;
import com.example.salledesportapplication.ui.abdos.AbdosFragment;
import com.example.salledesportapplication.ui.profil.ProfileFragment;

public class HomeFragment extends Fragment {
    public FragmentTransaction ft;
    ImageView bgapp ,cloverimg;
    LinearLayout splashtext, hometext, menu;
    private Button planBtn;
    private Button progressBtn;
    private Button settingsBtn;
    private Button exerciceBtn;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_home, container, false);

        bgapp = root.findViewById(R.id.bgapp);
        cloverimg = root.findViewById(R.id.cloverimg);
        splashtext = root.findViewById(R.id.splashtext);
        hometext = root.findViewById(R.id.hometext);
        menu = root.findViewById(R.id.menu);
        planBtn = root.findViewById(R.id.planBtn);
        progressBtn = root.findViewById(R.id.progressBtn);
        settingsBtn = root.findViewById(R.id.settingsBtn);
        exerciceBtn = root.findViewById(R.id.exerciceBtn);
        // Animation
        bgapp.animate().translationY(-1200).setDuration(1000).setStartDelay(300);
        cloverimg.animate().alpha(0).setDuration(1000).setStartDelay(900);
        splashtext.animate().translationY(140).alpha(0).setDuration(1000).setStartDelay(300);
        menu.animate().alpha(1).setStartDelay(900);

        //Button Intent
        planBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragment newFragment = new GymPlanFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.nav_host_fragment_content_menu, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });

        progressBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), Progress.class);
            startActivity(intent);
        });
        settingsBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragment newFragment = new ProfileFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.nav_host_fragment_content_menu, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });
        exerciceBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragment newFragment = new AbdosFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.nav_host_fragment_content_menu, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });

        return root;
    }




}