package com.example.android.mengenalbenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu_activity extends AppCompatActivity {

    ImageButton flowerButton,kendaraanButton, hewanButton, buahButton, foodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activity);

        flowerButton = (ImageButton) findViewById(R.id.bunga);
        kendaraanButton = (ImageButton) findViewById(R.id.kendaraan);
        hewanButton = (ImageButton) findViewById(R.id.hewan);
        buahButton = (ImageButton) findViewById(R.id.buah);
        foodButton = (ImageButton) findViewById(R.id.makanan);

        flowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bunganow = new Intent(menu_activity.this,ListBunga.class);
                startActivity(bunganow);

            }
        });

        kendaraanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bunganow = new Intent(menu_activity.this,ListKendaraan.class);
                startActivity(bunganow);

            }
        });

        hewanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bunganow = new Intent(menu_activity.this,ListHewan.class);
                startActivity(bunganow);

            }
        });

        buahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bunganow = new Intent(menu_activity.this,ListBuah.class);
                startActivity(bunganow);

            }
        });

        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bunganow = new Intent(menu_activity.this,ListMakanan.class);
                startActivity(bunganow);

            }
        });

    }
}
