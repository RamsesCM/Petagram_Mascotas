package com.radacode.petagrammascotas;

public class Mascota {

    private int fotoMascota;
    private String nombreMascota;
    private String numeroLikes;

    public Mascota(int fotoMascota, String nombreMascota, String numeroLikes) {
        this.fotoMascota = fotoMascota;
        this.nombreMascota = nombreMascota;
        this.numeroLikes = numeroLikes;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(String numeroLikes) {
        this.numeroLikes = numeroLikes;
    }
}
