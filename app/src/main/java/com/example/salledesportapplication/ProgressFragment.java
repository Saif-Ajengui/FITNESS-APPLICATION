package com.example.salledesportapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ProgressFragment extends Fragment {

    //var db
    private AppDataBase database;
    private TextView gymOne,nbrOne,gym2,nbr2,gym3,nbr3,gym4,nbr4,gym5,nbr5;
    TextView status1, status2,status3,status4,status5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_progress, container, false);
        status1 = root.findViewById(R.id.status1);
        status2 = root.findViewById(R.id.status2);
        status3 = root.findViewById(R.id.status3);
        status4 = root.findViewById(R.id.status4);
        status5 = root.findViewById(R.id.status5);

        gymOne = root.findViewById(R.id.gymOne);
        nbrOne = root.findViewById(R.id.nbrOne);

        gym2 = root.findViewById(R.id.gym2);
        nbr2 = root.findViewById(R.id.nbr2);

        gym3 = root.findViewById(R.id.gym3);
        nbr3 = root.findViewById(R.id.nbr3);

        gym4 = root.findViewById(R.id.gym4);
        nbr4 = root.findViewById(R.id.nbr4);

        gym5 = root.findViewById(R.id.gym5);
        nbr5 = root.findViewById(R.id.nbr5);

        //init db
        database = AppDataBase.getInstance(getActivity());

        status1.setOnClickListener(view -> {
            if(status1.getText().equals("To Do"))
            {
                status1.setText("Done");
            }
            else{
                status1.setText("To Do");
            }

        });

        status2.setOnClickListener(view -> {
            if(status2.getText().equals("To Do"))
            {
                status2.setText("Done");
            }
            else{
                status2.setText("To Do");
            }

        });

        status3.setOnClickListener(view -> {
            if(status3.getText().equals("To Do"))
            {
                status3.setText("Done");
            }
            else{
                status3.setText("To Do");
            }

        });
        status4.setOnClickListener(view -> {
            if(status4.getText().equals("To Do"))
            {
                status4.setText("Done");
            }
            else{
                status4.setText("To Do");
            }

        });

        status5.setOnClickListener(view -> {
            if(status5.getText().equals("To Do"))
            {
                status5.setText("Done");
            }
            else{
                status5.setText("To Do");
            }

        });


        try {
            this.afficherGymPlan();
            gymOne.setText(afficherGymPlan().getDay1());
            nbrOne.setText(String.valueOf(afficherGymPlan().getNb_exercices1()));

            gym2.setText(afficherGymPlan().getDay2());
            nbr2.setText(String.valueOf(afficherGymPlan().getNb_exercices2()));

            gym3.setText(afficherGymPlan().getDay3());
            nbr3.setText(String.valueOf(afficherGymPlan().getNb_exercices3()));

            gym4.setText(afficherGymPlan().getDay4());
            nbr4.setText(String.valueOf(afficherGymPlan().getNb_exercices4()));

            gym5.setText(afficherGymPlan().getDay5());
            nbr5.setText(String.valueOf(afficherGymPlan().getNb_exercices5()));
        }
        catch(NullPointerException e)
        {
            gymOne.setText("Gym");
            nbrOne.setText("number");
            status1.setText("To Do");

            gym2.setText("Gym");
            nbr2.setText("number");
            status2.setText("To Do");

            gym3.setText("Gym");
            nbr3.setText("number");
            status3.setText("To Do");

            gym4.setText("Gym");
            nbr4.setText("number");
            status4.setText("To Do");

            gym5.setText("Gym");
            nbr5.setText("number");
            status5.setText("To Do");
        }
        return root;
    }
    public GymPlanModel afficherGymPlan()
    {
        return  database.gymPlanDAO().getGymPlan();
    }
}