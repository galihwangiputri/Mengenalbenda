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

public class ListBuah extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Avocado",
            "Banana",
            "Blueberry",
            "Cherry",
            "Grape",
            "Lemon",
            "Orange",
            "Peach",
            "Raspberry",
            "Strawberry",
            "Watermelon"
    };

    Integer[] imgid = {

            R.drawable.avocado,
            R.drawable.banana,
            R.drawable.blueberry,
            R.drawable.cherries,
            R.drawable.grapes,
            R.drawable.lemon,
            R.drawable.orange,
            R.drawable.peach,
            R.drawable.raspberry,
            R.drawable.strawberry,
            R.drawable.watermelon
    };

    String[] tambahan = {
            "Alpukat (ID) || Avocado (DE)",
            "Pisang (ID) || Banane (DE)",
            "Blueberi (ID) || Blaubeere (DE)",
            "Ceri (ID) || Kirsche (DE)",
            "Anggur (ID) || Traube (DE)",
            "Lemon (ID) || Zitrone (DE)",
            "Jeruk (ID) || Orange (DE)",
            "Persik (ID) || Pfirsich (DE)",
            "Raspberi (ID) || Himbeere (DE)",
            "Stroberi (ID) || Erdbeere (DE)",
            "Semangka (ID) || Wassermelone"

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

