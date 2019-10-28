package com.example.cofig;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<Cosa> {

    Context cnt;

    public Adapter(@NonNull Context context, int resource,  ArrayList<Cosa> lista) {
        super(context, resource, lista);
        this.cnt = context;
        this.lista = lista;
    }

    ArrayList<Cosa> lista =new ArrayList<>();

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Cosa c = getItem(position);
        if(convertView == null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);

        }
        TextView txt = (TextView)convertView.findViewById(R.id.txtPrueba);
        int idImg = this.cnt.getResources().getIdentifier(c.getImagen(),"Drawable",this.cnt.getPackageName());
        Drawable imgs = (Drawable)this.cnt.getResources().getDrawable(idImg);

        ImageView img = (ImageView)convertView.findViewById(R.id.img);

        txt.setText(c.getTxt());
        img.setImageDrawable(imgs);

        return super.getView(position, convertView, parent);
    }
}
