package com.example.pariwisataenim;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imggambar;
    TextView txtdetail;
    TextView lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imggambar = (ImageView) findViewById(R.id.imgdetail);
        txtdetail = (TextView) findViewById(R.id.txtdetail);
        lokasi = (TextView) findViewById(R.id.txtlokasi);

        Intent terimaData = getIntent();
        String nm = terimaData.getStringExtra("Nama");
        getSupportActionBar().setTitle(nm);

        imggambar.setImageResource(terimaData.getIntExtra("IMG", 1));

        txtdetail.setText(terimaData.getStringExtra("DET"));
        lokasi.setText(terimaData.getStringExtra("LOK"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
