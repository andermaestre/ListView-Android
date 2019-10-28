package com.example.cofig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Cosa> lista= new ArrayList<>();
    String []Txts;
    String []Imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listaView);

        Txts = getResources().getStringArray(R.array.txtPalCampo);
        Imgs = getResources().getStringArray(R.array.imagenes);
        for(int i=0;i<Txts.length;i++){
            lista.add(new Cosa(Txts[i],Imgs[i]));
        }

        Adapter adp = new Adapter(this,R.layout.item_lista,lista);
        lv.setAdapter(adp);
    }
}
