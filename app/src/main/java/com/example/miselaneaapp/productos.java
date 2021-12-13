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
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class productos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        // imagen de arte
        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.arte, getTheme());

        ImageView i_arte = (ImageView) findViewById(R.id.i_arte);
        i_arte.setImageDrawable(drawable);
        // imagen escolar
        Resources res2 = getResources();
        Drawable drawable2 = res2.getDrawable(R.drawable.escolar, getTheme()); //arte, getTheme());

        ImageView i_escolar = (ImageView) findViewById(R.id.i_escolar);
        i_escolar.setImageDrawable(drawable2);

        //video juegos
        Resources res3 = getResources();
        Drawable drawable3 = res3.getDrawable(R.drawable.videojuegos, getTheme()); //arte, getTheme());

        ImageView i_videojuegos = (ImageView) findViewById(R.id.i_videojuegos);
        i_videojuegos.setImageDrawable(drawable3);

        //Juguetes
        Resources res4 = getResources();
        Drawable drawable4 = res4.getDrawable(R.drawable.juguetes, getTheme()); //arte, getTheme());

        ImageView i_juguetes = (ImageView) findViewById(R.id.i_juguetes);
        i_juguetes.setImageDrawable(drawable4);

        //Tecnologia
        Resources res5 = getResources();
        Drawable drawable5 = res5.getDrawable(R.drawable.tecnologia, getTheme()); // arte, getTheme());

        ImageView i_tecnologia = (ImageView) findViewById(R.id.i_tecnologia);
        i_tecnologia.setImageDrawable(drawable5);

        //Oficina
        Resources res6 = getResources();
        Drawable drawable6 = res6.getDrawable(R.drawable.oficina, getTheme());  //arte, getTheme());

        ImageView i_oficina = (ImageView) findViewById(R.id.i_oficina);
        i_oficina.setImageDrawable(drawable6);

        Button bt_arte = (Button) findViewById(R.id.b_arte);
        bt_arte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente en Reto 2",Toast.LENGTH_LONG).show();
            }
        });

        Button bt_escolar = (Button) findViewById(R.id.b_escolar);
        bt_escolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente en Reto 2",Toast.LENGTH_LONG).show();
            }
        });

        Button bt_videojuegos = (Button) findViewById(R.id.b_videojuegos);
        bt_videojuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente en Reto 2",Toast.LENGTH_LONG).show();
            }
        });

        Button bt_juguetes = (Button) findViewById(R.id.b_juguetes);
        bt_juguetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente en Reto 2",Toast.LENGTH_LONG).show();
            }
        });

        Button bt_tecnologia = (Button) findViewById(R.id.b_tecnologia);
        bt_tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente en Reto 2",Toast.LENGTH_LONG).show();
            }
        });

        Button bt_oficina = (Button) findViewById(R.id.b_oficina);
        bt_oficina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente en Reto 2",Toast.LENGTH_LONG).show();
            }
        });

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
            Intent intent = new Intent(productos.this,productos.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.servicios){
            Intent intent = new Intent(productos.this,Ac_servicios.class);
            startActivity(intent);
            finish();
        }

        if (id == R.id.sucursales){
            Intent intent = new Intent(productos.this,sucursales.class);
            startActivity(intent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}