package tpIntegradorTorneo;

import java.util.ArrayList;

public class Ronda {
	
	private String numRound;
    private ArrayList<Partido> partidos;

    public Ronda() {
    }

    public Ronda(String numRound, ArrayList<Partido> partidos) {
        this.numRound = numRound;
        this.partidos = partidos;
    }

    public String getNumero() {
        return numRound;
    }

    public void setNumero(String numRound) {
        this.numRound = numRound;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    

    public int totalPuntos(ArrayList<Pronostico> pronosticos, Apostador apostador) {
        int i = 0;
        int total = 0;
        while (i < pronosticos.size()) {
            total += pronosticos.get(i).puntos(apostador);
            i++;
        }
        return total;
    }
}
