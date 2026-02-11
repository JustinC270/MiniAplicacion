package es.fplumara.dam1.textapp.model;

import java.time.LocalDateTime;

public class Message {

    private String text;
    private LocalDateTime tiempoDeCreacion;
    private int NumeroPalabra;

    public void Message(String text) {

    }

    public LocalDateTime getTiempoDeCreacion() {
        return tiempoDeCreacion;
    }

    public void setTiempoDeCreacion(LocalDateTime tiempoDeCreacion) {
        this.tiempoDeCreacion = tiempoDeCreacion;
    }

    public int getNumeroPalabra() {
        return NumeroPalabra;
    }

    public void setNumeroPalabra(int numeroPalabra) {
        NumeroPalabra = numeroPalabra;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

