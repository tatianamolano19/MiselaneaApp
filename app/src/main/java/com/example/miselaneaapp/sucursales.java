package com.example.miselaneaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class sucursales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        Resources res1 = getResources();
        Drawable drawable1 = res1.getDrawable(R.drawable.mapa, getTheme());

        ImageView i_toberin = (ImageView) findViewById(R.id.i_toberin);
        i_toberin.setImageDrawable(drawable1);

        Resources res2 = getResources();
        Drawable drawable2 = res2.getDrawable(R.drawable.mapa, getTheme());

        ImageView i_suba = (ImageView) findViewById(R.id.i_suba);
        i_suba.setImageDrawable(drawable2);

        Resources res3 = getResources();
        Drawable drawable3 = res3.getDrawable(R.drawable.mapa, getTheme());

        ImageView i_cota = (ImageView) findViewById(R.id.i_cota);
        i_cota.setImageDrawable(drawable3);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.productos){
            Intent intent = new Intent(sucursales.this,productos.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.servicios){
            Intent intent = new Intent(sucursales.this,Ac_servicios.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.sucursales){
            Intent intent = new Intent(sucursales.this,sucursales.class);
            startActivity(intent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}