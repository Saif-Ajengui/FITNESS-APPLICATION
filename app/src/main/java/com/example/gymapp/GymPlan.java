package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GymPlan extends AppCompatActivity implements Custom_dialog.Custom_DialogInterface {

    //var db
    private AppDataBase database;

    //widgets
    private Button addBtn,deleteBtn;
    private TextView gymOne,nbrOne,gym2,nbr2,gym3,nbr3,gym4,nbr4,gym5,nbr5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_plan);

        addBtn = findViewById(R.id.addBtn);
        deleteBtn = findViewById(R.id.deleteBtn);
        gymOne = findViewById(R.id.gymOne);
        nbrOne = findViewById(R.id.nbrOne);

        gym2 = findViewById(R.id.gym2);
        nbr2 = findViewById(R.id.nbr2);

        gym3 = findViewById(R.id.gym3);
        nbr3 = findViewById(R.id.nbr3);

        gym4 = findViewById(R.id.gym4);
        nbr4 = findViewById(R.id.nbr4);

        gym5 = findViewById(R.id.gym5);
        nbr5 = findViewById(R.id.nbr5);

        //init db
        database = AppDataBase.getInstance(this);

        addBtn.setOnClickListener(view -> this.openDialog(view));
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

    }

    public  void openDialog(View view){
        Custom_dialog custom_dialog = new Custom_dialog();
        custom_dialog.show(getSupportFragmentManager(), "Custom gym plan");
    }


    @Override
    public void applyTexts(String gymOne, int nbr_exercices_DayOne,String gym2, int nbr_exercices_Day2
                            ,String gym3, int nbr_exercices_Day3,String gym4, int nbr_exercices_Day4
                            ,String gym5, int nbr_exercices_Day5) {
        //save values to db
        GymPlanModel gp = new GymPlanModel(gymOne,nbr_exercices_DayOne,gym2,nbr_exercices_Day2,gym3,nbr_exercices_Day3,gym4,nbr_exercices_Day4,gym5,nbr_exercices_Day5);
        try{
            ajouterGymPlan(gp);
            this.gymOne.setText(afficherGymPlan().getDay1());
            this.nbrOne.setText(String.valueOf(afficherGymPlan().getNb_exercices1()));

            this.gym2.setText(afficherGymPlan().getDay2());
            this.nbr2.setText(String.valueOf(afficherGymPlan().getNb_exercices2()));

            this.gym3.setText(afficherGymPlan().getDay3());
            this.nbr3.setText(String.valueOf(afficherGymPlan().getNb_exercices3()));

            this.gym4.setText(afficherGymPlan().getDay4());
            this.nbr4.setText(String.valueOf(afficherGymPlan().getNb_exercices4()));

            this.gym5.setText(afficherGymPlan().getDay5());
            this.nbr5.setText(String.valueOf(afficherGymPlan().getNb_exercices5()));
        }   catch (NullPointerException e)
        {
            this.gymOne.setText("Gym");
            this.nbrOne.setText("number");

            this.gym2.setText("Gym");
            this.nbr2.setText("number");

            this.gym3.setText("Gym");
            this.nbr3.setText("number");

            this.gym4.setText("Gym");
            this.nbr4.setText("number");

            this.gym5.setText("Gym");
            this.nbr5.setText("number");
        }


    }
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