package com.example.salledesportapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class bicepss extends AppCompatActivity {
    private ListView listBiceps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicepss);
        listBiceps= findViewById(R.id.list_biceps);
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> item;
        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"
        String[] title = new String[]{
                getResources().getString(R.string.Exercice1),
                getResources().getString(R.string.Exercice2),
                getResources().getString(R.string.Exercice3),
                getResources().getString(R.string.Exercice4),
                getResources().getString(R.string.Exercice5)};
        // Icones (images) des items
        String[] icon = new String[]{
                String.valueOf(R.drawable.b1),
                String.valueOf(R.drawable.b2),
                String.valueOf(R.drawable.b3),
                String.valueOf(R.drawable.b4),
                String.valueOf(R.drawable.b5)};
        // Creation des items de la liste
        for (int i = 0; i < 5; i++) {
            item = new HashMap<>();
            // Titre
            item.put("title", title[i]);

            // Icone
            item.put("icon", icon[i]);
            listItem.add(item);

            SimpleAdapter adapter = new SimpleAdapter(getApplication(),
                    listItem,
                    R.layout.activity_list,
                    new String[]{"title", "icon"},
                    new int[]{R.id.titre, R.id.img});
            // Association de l’adapter à la liste
            listBiceps.setAdapter(adapter);
        }
        listBiceps.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap item = (HashMap) listBiceps.getItemAtPosition(position);
                Toast.makeText(getApplication(), "" + item.get("title"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}