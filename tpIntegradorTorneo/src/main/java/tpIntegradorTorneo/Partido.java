package tpIntegradorTorneo;

public class Partido {
	
	private Equipo equipo1Local;
    private Equipo equipo2Visitante;
    private int goles1Local;
    private int goles2Visitante;

    public Partido() {
    }

    public Partido(Equipo equipo1Local, int goles1Local,
    				int goles2Visitante, Equipo equipo2Visitante) {
        this.equipo1Local = equipo1Local;
        this.goles1Local = goles1Local;
        this.goles2Visitante = goles2Visitante;
        this.equipo2Visitante = equipo2Visitante;
    }

    public Equipo getEquipo1Local() {
        return equipo1Local;
    }

    public void setEquipo1Local(Equipo local) {
        this.equipo1Local = local;
    }

    public Equipo getEquipo2Visitante() {
        return equipo2Visitante;
    }

    public void setEquipo2Visitante(Equipo visitante) {
        this.equipo2Visitante = visitante;
    }

    public int getGoles1Local() {
        return goles1Local;
    }

    public void setGoles1Local(int goles1Local) {
        this.goles1Local = goles1Local;
    }

    public int getGoles2Visitante() {
        return goles2Visitante;
    }

    public void setGoles2Visitante(int goles2Visitante) {
        this.goles2Visitante = goles2Visitante;
    }

    public ResultadoEnum resultadoPartido(Equipo equipo) {
        if (equipo == equipo1Local) {
            if (getGoles1Local() > getGoles2Visitante()) {
                return ResultadoEnum.GANADOR;
            
            } else if  (getGoles1Local() == getGoles2Visitante()) {
                return ResultadoEnum.EMPATE;
            
            } else {
                return ResultadoEnum.PERDEDOR;
            }
            
        } else if (equipo == equipo2Visitante) {
            if (getGoles2Visitante() > getGoles1Local()) {
                return ResultadoEnum.GANADOR;
            
            } else if (getGoles1Local() == getGoles2Visitante()) {
                return ResultadoEnum.EMPATE;
            
            } else {
                return ResultadoEnum.PERDEDOR;
            }
        }
        return ResultadoEnum.PERDEDOR;
    }
}
