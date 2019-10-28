package com.example.cofig;

public class Cosa {
    String txt;
    String imagen;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Cosa(String txt, String imagen) {
        this.txt = txt;
        this.imagen = imagen;
    }
}
