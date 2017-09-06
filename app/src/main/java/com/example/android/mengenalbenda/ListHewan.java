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

public class ListHewan extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Bee",
            "Cat",
            "Cow",
            "Deer",
            "Bulldog",
            "Elephant",
            "Fox",
            "Lion",
            "Fish",
            "Tiger",
            "Wolf"
    };

    Integer[] imgid = {

            R.drawable.bee,
            R.drawable.cat,
            R.drawable.cow,
            R.drawable.deer,
            R.drawable.bulldog,
            R.drawable.elephant,
            R.drawable.fox,
            R.drawable.lion,
            R.drawable.piranha,
            R.drawable.tiger,
            R.drawable.wolf
    };

    String[] tambahan = {
            "Lebah",
            "Kucing",
            "Sapi",
            "Rusa",
            "Buldog",
            "Gajah",
            "Rubah",
            "Singa",
            "Ikan",
            "Harimau",
            "Serigala"
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


