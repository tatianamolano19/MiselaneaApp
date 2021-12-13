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
import android.widget.Toast;

public class Main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.arte, getTheme());

        ImageView empresa = (ImageView) findViewById(R.id.empresa);
        empresa.setImageDrawable(drawable);
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
            Intent intent = new Intent(Main1.this,productos.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.servicios){
            Intent intent = new Intent(Main1.this,Ac_servicios.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.sucursales){
            Intent intent = new Intent(Main1.this,sucursales.class);
            startActivity(intent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}