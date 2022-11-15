package com.example.salledesportapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.salledesportapplication.ui.abdos.AbdosFragment;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class GymPlanFragment extends Fragment {


    //var db
    private AppDataBase database;

    //widgets
    private Button addBtn,deleteBtn;
    private TextView nbrOne,nbr2,nbr3,nbr4,nbr5,gymOne,gym2,gym3,gym4,gym5;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_gym_plan, container, false);
        addBtn = root.findViewById(R.id.addBtn);
        deleteBtn = root.findViewById(R.id.deleteBtn);
        gymOne = root.findViewById(R.id.gyma);
        nbrOne = root.findViewById(R.id.nbrOne);

        gym2 = root.findViewById(R.id.gymb);
        nbr2 = root.findViewById(R.id.nbr2);

        gym3 = root.findViewById(R.id.gymc);
        nbr3 = root.findViewById(R.id.nbr3);

        gym4 = root.findViewById(R.id.gymd);
        nbr4 = root.findViewById(R.id.nbr4);

        gym5 = root.findViewById(R.id.gyme);
        nbr5 = root.findViewById(R.id.nbr5);

        //init db
        database = AppDataBase.getInstance(getActivity());

        addBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragment newFragment = new DialogFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.nav_host_fragment_content_menu, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }

        });
        deleteBtn.setOnClickListener(view ->
                {
                    this.suprimerGymPlan();
                    gymOne.setText("Gym");
                    nbrOne.setText("number");

                    gym2.setText("Gym");
                    nbr2.setText("number");

                    gym3.setText("Gym");
                    nbr3.setText("number");

                    gym4.setText("Gym");
                    nbr4.setText("number");

                    gym5.setText("Gym");
                    nbr5.setText("number");

                }
        );

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

            gym2.setText("Gym");
            nbr2.setText("number");

            gym3.setText("Gym");
            nbr3.setText("number");

            gym4.setText("Gym");
            nbr4.setText("number");

            gym5.setText("Gym");
            nbr5.setText("number");
        }





        return root;
    }


    public void applyTexts(String gymOne, int nbr_exercices_DayOne,String gym2, int nbr_exercices_Day2
            ,String gym3, int nbr_exercices_Day3,String gym4, int nbr_exercices_Day4
            ,String gym5, int nbr_exercices_Day5) {
        //save values to db
        GymPlanModel gp = new GymPlanModel(gymOne,nbr_exercices_DayOne,false,gym2,nbr_exercices_Day2,false,gym3,nbr_exercices_Day3,false,gym4,nbr_exercices_Day4,false,gym5,nbr_exercices_Day5,false);




    }


    public GymPlanModel afficherGymPlan()
    {
        return  database.gymPlanDAO().getGymPlan();
    }
    public void suprimerGymPlan()
    {
        database.gymPlanDAO().deleteGymPlan();
    }
}