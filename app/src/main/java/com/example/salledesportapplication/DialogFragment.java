package com.example.salledesportapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class DialogFragment extends Fragment {

    EditText gymOne, nbr_exercices_DayOne;
    EditText gym2,gym3,gym4,gym5,nbr_exercices_Day2,nbr_exercices_Day3,nbr_exercices_Day4,nbr_exercices_Day5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View view =  inflater.inflate(R.layout.fragment_dialog, container, false);


         /*             String txtOne = gymOne.getText().toString();
                        int nbOne = Integer.valueOf(nbr_exercices_DayOne.getText().toString());

                        String txt2 = gym2.getText().toString();
                        int nb2 = Integer.valueOf(nbr_exercices_Day2.getText().toString());

                        String txt3 = gym3.getText().toString();
                        int nb3 = Integer.valueOf(nbr_exercices_Day3.getText().toString());

                        String txt4 = gym4.getText().toString();
                        int nb4 = Integer.valueOf(nbr_exercices_Day4.getText().toString());

                        String txt5 = gym5.getText().toString();
                        int nb5 = Integer.valueOf(nbr_exercices_Day5.getText().toString());
                        // To See
                        dialogInterface.applyTexts(txtOne,nbOne,txt2,nb2,txt3,nb3,txt4,nb4,txt5,nb5);



        gymOne = view.findViewById(R.id.gymOne);
        nbr_exercices_DayOne = view.findViewById(R.id.nbr_exercices_DayOne);

        gym2 = view.findViewById(R.id.gym2);
        nbr_exercices_Day2 = view.findViewById(R.id.nbr_exercices_Day2);

        gym3 = view.findViewById(R.id.gym3);
        nbr_exercices_Day3 = view.findViewById(R.id.nbr_exercices_Day3);

        gym4 = view.findViewById(R.id.gym4);
        nbr_exercices_Day4 = view.findViewById(R.id.nbr_exercices_Day4);

        gym5 = view.findViewById(R.id.gym5);
        nbr_exercices_Day5 = view.findViewById(R.id.nbr_exercices_Day5);*/
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
}