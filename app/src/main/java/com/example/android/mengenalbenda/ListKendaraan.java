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

public class ListKendaraan extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Airplane",
            "Car",
            "Bicycle",
            "Bus",
            "Delivery Truck",
            "Freight",
            "Cruise",
            "Motor Biking",
            "Motor Sport",
            "MRT (Mass Rapid Transit)",
            "Segway",
            "Minibus"
    };

    Integer[] imgid = {

            R.drawable.airplanes,
            R.drawable.automobile,
            R.drawable.bicycle,
            R.drawable.buses,
            R.drawable.deliverytruck,
            R.drawable.freight,
            R.drawable.leisure,
            R.drawable.motorbiking,
            R.drawable.motorsports,
            R.drawable.mrt,
            R.drawable.segway,
            R.drawable.tourist

    };

    String[] tambahan = {
            "Pesawat Terbang (ID) || Flugzeug (DE)",
            "Mobil (ID) || Auto (DE)",
            "Sepeda (ID) || Fahrrad (DE)",
            "Bus (ID) || Bus (DE)",
            "Truk Pengiriman (ID) || Lieferwagen (DE)",
            "Kargo (ID) || Ladung (DE)",
            "Kapal Pesiar (ID) || Kreuzfahrt (DE)",
            "Sepeda Motor (ID) || Motorradfahren (DE)",
            "Motor Sport (ID) || Motorsport (DE)",
            "Kereta Cepat (ID) || MRT (DE)",
            "Segway (ID) || Segway (DE)",
            "Bus Mini(ID) || Minibusse"

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


