package com.example.salledesportapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class DialogFragment extends Fragment {
    //var db
    private AppDataBase database;


    // Widgets
    private Button addBtn;
    EditText gymOne, nbr_exercices_DayOne;
    EditText gym2,gym3,gym4,gym5,nbr_exercices_Day2,nbr_exercices_Day3,nbr_exercices_Day4,nbr_exercices_Day5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View view =  inflater.inflate(R.layout.fragment_dialog, container, false);

        //init db
        database = AppDataBase.getInstance(getActivity());


        addBtn = view.findViewById(R.id.addBtn);

        gymOne = view.findViewById(R.id.gymOne);
        nbr_exercices_DayOne = view.findViewById(R.id.nbr_exercices_DayOne);

        gym2 = view.findViewById(R.id.gym2);
        nbr_exercices_Day2 = view.findViewById(R.id.nbr_exercices_Day2);

        gym3 = view.findViewById(R.id.gym3);
        nbr_exercices_Day3 = view.findViewById(R.id.nbr_exercices_Day3);

        gym4 = view.findViewById(R.id.gym4);
        nbr_exercices_Day4 = view.findViewById(R.id.nbr_exercices_Day4);

        gym5 = view.findViewById(R.id.gym5);
        nbr_exercices_Day5 = view.findViewById(R.id.nbr_exercices_Day5);
        addBtn.setOnClickListener(l ->{
            GymPlanModel gp = new GymPlanModel(gymOne.toString(),Integer.valueOf(nbr_exercices_DayOne.getText().toString()),false,gym2.toString(),Integer.valueOf(nbr_exercices_Day2.getText().toString()),false,gym3.toString(),Integer.valueOf(nbr_exercices_Day3.getText().toString()),false,gym4.toString(),Integer.valueOf(nbr_exercices_Day4.getText().toString()),false,gym5.toString(),Integer.valueOf(nbr_exercices_Day5.getText().toString()),false);
            ajouterGymPlan(gp);
            Fragment newFragment = new GymPlanFragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            transaction.replace(R.id.nav_host_fragment_content_menu, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });



        return view;
    }
   /* @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogInterface = (Custom_dialog.Custom_DialogInterface) context;

    }

    public interface  Custom_DialogInterface {
        void applyTexts(String gymOne, int nbr_exercices_DayOne,String gym2, int nbr_exercices_Day2,
                        String gym3, int nbr_exercices_Day3,
                        String gym4, int nbr_exercices_Day4,
                        String gym5, int nbr_exercices_Day5);
    }*/

    public void ajouterGymPlan(GymPlanModel gp)
    {
        database.gymPlanDAO().deleteGymPlan();
        database.gymPlanDAO().insertGymPlan(gp);
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