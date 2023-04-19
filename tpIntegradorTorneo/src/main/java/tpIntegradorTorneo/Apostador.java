package tpIntegradorTorneo;

import java.util.ArrayList;

public class Apostador {

	private String nombre;
    private Ronda ronda;
    private ArrayList<Pronostico> pronostico;
    
    public Apostador() {
    }

    public Apostador(String nombre, Ronda ronda, ArrayList<Pronostico> pronosticos) {
        this.nombre = nombre;
        this.ronda = ronda;
        this.pronostico = pronosticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ronda getRonda() {
        return ronda;
    }

    public void setRonda(Ronda ronda) {
        this.ronda = ronda;
    }

    public ArrayList<Pronostico> getPronostico() {
        return pronostico;
    }

    public void setPronostico(ArrayList<Pronostico> pronostico) {
        this.pronostico = pronostico;
    }

    @Override
    public String toString() {
        return "Apostador{" +
                "nombre='" + nombre + '\'' +
                ", ronda=" + ronda +
                ", ronda=" + ronda +
                ", pronostico=" + pronostico +
                '}';
    }
}

