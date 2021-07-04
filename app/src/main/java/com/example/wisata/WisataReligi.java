package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataReligi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_religi);


        // untuk menngisi data di listview//
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Masjid Baitul Izzah","Masjid Raya At-Taqwa", "Masjid Khalifah"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);


        // menggunakan onclick listener agar nanti jika di clik akan muncul gambar deskripsi serta lokasi//
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), MasjidBaitulIzzah.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), MasjidRayaAtTaqwa.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), MasjidKhalifah.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}