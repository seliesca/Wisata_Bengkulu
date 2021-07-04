package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataKuliner extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        // menggunnkan listview dan string terbut untuk mengisi dari tabel listview//

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Rumah Makan Muara Jenggalu","Kampoeng Pesisir","Pempek Saskia","Aloha Resto","Pempek Cek Toni","Pindang 77 Bengkulu","Rm Marola","Ikan Bakar Jingkrak","Ikan Bakar 5227","Rm Sari Eco","Rm Inga Raya","Pempek Betty","Resto Tanjung Karang","Rm Takana Juo","Lontong Tunjang Kapuas"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        //menggunkan onclik agar 2 pilihan wisata pertama dapat di klik sengiinga muncul sedikit deskripsi gambar dan lokasi//

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), MuaraJenggalu.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), KampoengPesisir.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}