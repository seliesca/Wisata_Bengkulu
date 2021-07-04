package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataEdukasi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_edukasi);

        //list view digunkan untuk mengisi kolom listview di dalam layout//

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Benteng Malborough","Rumah Pengangsingan Bung Karno","Musium Bengkulu","Tugu Thomas Parr", "Taman Budaya Provinsi Bengkulu","Rumah Fatmawati","Masjid Jamik","Kampung Tionghoa","Makam Inggris Jitra","Persemanyaman Panglima Sentot Ali Basya","Kantor Pemerintahan Thomas Stamford Raffles"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

            // menggunakan on clik agar dapat di klik pad saat benteng malborough dan rumah pengangsingan bungkarno di klik//
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), BentengMalborough.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), RumahPengangsinganBungKarno.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}