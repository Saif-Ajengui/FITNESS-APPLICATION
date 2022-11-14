package com.example.gymapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Custom_dialog extends AppCompatDialogFragment  {

    EditText gymOne, nbr_exercices_DayOne;
    EditText gym2,gym3,gym4,gym5,nbr_exercices_Day2,nbr_exercices_Day3,nbr_exercices_Day4,nbr_exercices_Day5;
    Custom_DialogInterface dialogInterface;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.layout_dialog, null);

        builder.setView(view)
                .setTitle("Test Custom Dialog")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String txtOne = gymOne.getText().toString();
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
                    }
                });


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
        return builder.create();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogInterface = (Custom_DialogInterface) context;

    }

    public interface  Custom_DialogInterface {
        void applyTexts(String gymOne, int nbr_exercices_DayOne,String gym2, int nbr_exercices_Day2,
                        String gym3, int nbr_exercices_Day3,
                        String gym4, int nbr_exercices_Day4,
                        String gym5, int nbr_exercices_Day5);
    }
}
