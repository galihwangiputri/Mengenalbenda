package com.example.android.mengenalbenda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by user on 6/3/17.
 */

public class ListBunga extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Alstroemeria",
            "Anthurium",
            "Bougainvillea",
            "Carnation",
            "Daisy",
            "Dianthus",
            "Jasmine",
            "Oleander",
            "Orchid",
            "Peony",
            "Protea",
            "Rose",
            "Sunflower",
            "Wedelia"
    };

    Integer[] imgid = {

            R.drawable.alstroemeria,
            R.drawable.anthurium,
            R.drawable.bougainvillea,
            R.drawable.carnation,
            R.drawable.daisy,
            R.drawable.dianthus,
            R.drawable.jasmine,
            R.drawable.oleander,
            R.drawable.orchid,
            R.drawable.peony,
            R.drawable.protea,
            R.drawable.rose,
            R.drawable.sunflower,
            R.drawable.wedelia,
    };

    String[] tambahan = {
            "Alstroemeria (ID) || Alstroemeria (DE)",
            "Anthurium (ID) || Anthurium (DE)",
            "Bougainvillea (ID) || Bougainvillea (DE)",
            "Anyelir (ID) || Nelke (DE)",
            "Aster (ID) || Gänseblümchen (DE)",
            "Dianthus (ID) || Dianthus (DE)",
            "Melati (ID) || Jasmin (DE)",
            "Oleander (ID) || Oleander (DE)",
            "Anggrek (ID) || Orchidee (DE)",
            "Peony (ID) || Pfingstrose (DE)",
            "Protea (ID) || Protea (DE)",
            "Mawar (ID) || Rose (DE)",
            "Matahari (ID) || Sonnenblume (DE)",
            "Wedelia (ID) || Wedelia (DE)"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



        CostumListAdapter adapter = new CostumListAdapter(this, itemname, imgid,tambahan);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), selecteditem, Toast.LENGTH_LONG).show();

            }
        });
    }
}
