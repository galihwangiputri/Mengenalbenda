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

public class ListMakanan extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Doughnut",
            "Hamburger",
            "Ice Cream",
            "Satay",
            "Meat",
            "Pizza",
            "Sandwich",
            "Candy"
    };

    Integer[] imgid = {

            R.drawable.doughnut,
            R.drawable.hamburguer,
            R.drawable.icecream,
            R.drawable.kebab,
            R.drawable.meat,
            R.drawable.pizza,
            R.drawable.sandwich,
            R.drawable.toffee
    };

    String[] tambahan = {

            "Donat",
            "Roti isi daging",
            "Es krim",
            "Sate",
            "Daging",
            "Pizza",
            "Sandwich",
            "Permen"
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

