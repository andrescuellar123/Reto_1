package com.example.reto1;

public class Post {
    private String nombreEvento , ubicacionEvento, horaInicio , horaFin;

    public Post(String nombreEvento, String ubicacionEvento, String horaInicio, String horaFin) {
        this.nombreEvento = nombreEvento;
        this.ubicacionEvento = ubicacionEvento;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getUbicacionEvento() {
        return ubicacionEvento;
    }

    public void setUbicacionEvento(String ubicacionEvento) {
        this.ubicacionEvento = ubicacionEvento;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
