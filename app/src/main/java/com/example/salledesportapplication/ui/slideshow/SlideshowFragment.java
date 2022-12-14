package com.example.salledesportapplication.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.salledesportapplication.R;


import java.util.ArrayList;
import java.util.HashMap;

public class SlideshowFragment extends Fragment {


    private ListView listDorsaux;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dorsaux, container, false);

        listDorsaux = root.findViewById(R.id.list_biceps);
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
                String.valueOf(R.drawable.d1),
                String.valueOf(R.drawable.d2),
                String.valueOf(R.drawable.d3),
                String.valueOf(R.drawable.d4),
                String.valueOf(R.drawable.d5)};
        // Creation des items de la liste
        for (int i = 0; i < 5; i++) {
            item = new HashMap<>();
            // Titre
            item.put("title", title[i]);

            // Icone
            item.put("icon", icon[i]);
            listItem.add(item);

            SimpleAdapter adapter = new SimpleAdapter(getActivity(),
                    listItem,
                    R.layout.activity_list,
                    new String[]{"title", "icon"},
                    new int[]{R.id.titre, R.id.img});
            // Association de l’adapter à la liste
            listDorsaux.setAdapter(adapter);
        }
        listDorsaux.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap item = (HashMap) listDorsaux.getItemAtPosition(position);
                Toast.makeText(getActivity(), "" + item.get("title"), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}