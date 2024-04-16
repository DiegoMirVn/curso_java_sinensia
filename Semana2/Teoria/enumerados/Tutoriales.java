package com.sinensia.enumerados;

public enum Tutoriales {
    //Ahora cada tutorial tiene un precio
    JAVA(40), HTML(30), MYSQL(25);
    
    int precio;

    private Tutoriales(int precio) {
            this.precio = precio;
    }
    public int mostrarPrecio() {
            return precio;
    }
}