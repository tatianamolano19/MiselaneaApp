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

public class Ac_servicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        //Fotocopias
        Resources res1 = getResources();
        Drawable drawable1 = res1.getDrawable(R.drawable.fotocofias, getTheme()); //arte, getTheme());

        ImageView i_foto = (ImageView) findViewById(R.id.i_foto);
        i_foto.setImageDrawable(drawable1);

        //Impresion
        Resources res2 = getResources();
        Drawable drawable2 = res2.getDrawable(R.drawable.impresion, getTheme()); //arte, getTheme());

        ImageView i_impresion = (ImageView) findViewById(R.id.i_impresion);
        i_impresion.setImageDrawable(drawable2);

        //Curso de dibujo
        Resources res3 = getResources();
        Drawable drawable3 = res3.getDrawable(R.drawable.cursosdibujo, getTheme()); //arte, getTheme());

        ImageView i_curdib = (ImageView) findViewById(R.id.i_curdib);
        i_curdib.setImageDrawable(drawable3);

        //Venta mayor
        Resources res4 = getResources();
        Drawable drawable4 = res4.getDrawable(R.drawable.ventamayor, getTheme()); //arte, getTheme());

        ImageView i_venta = (ImageView) findViewById(R.id.i_venta);
        i_venta.setImageDrawable(drawable4);
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
            Intent intent = new Intent(Ac_servicios.this,productos.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.servicios){
            Intent intent = new Intent(Ac_servicios.this,Ac_servicios.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.sucursales){
            Intent intent = new Intent(Ac_servicios.this,sucursales.class);
            startActivity(intent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}