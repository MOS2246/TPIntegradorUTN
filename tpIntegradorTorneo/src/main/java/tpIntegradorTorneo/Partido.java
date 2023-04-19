package tpIntegradorTorneo;

public class Partido {
	
	private Equipo equipo1local;
	private Equipo equipo2visitante;
	private int goles1local;
	private int goles2visitante;
	
	public Partido() {
	}
	//Constructor
	public Partido(Equipo equipo1local, Equipo equipo2visitante) {
		super();
		this.equipo1local = equipo1local;
		this.equipo2visitante = equipo2visitante;
	}
	
	public Equipo getEquipo1local() {
		return equipo1local;
	}

	public void setEquipo1local(Equipo equipo1local) {
		this.equipo1local = equipo1local;
	}

	public Equipo getEquipo2visitante() {
		return equipo2visitante;
	}

	public void setEquipo2visitante(Equipo equipo2visitante) {
		this.equipo2visitante = equipo2visitante;
	}

	public int getGoles1local() {
		return goles1local;
	}

	public void setGoles1local(int goles1local) {
		this.goles1local = goles1local;
	}

	public int getGoles2visitante() {
		return goles2visitante;
	}

	public void setGoles2visitante(int goles2visitante) {
		this.goles2visitante = goles2visitante;
	}
	//Metodo
	public ResultadoEnum resultado(Equipo equipo) {
		if(goles1local == goles2visitante) {
			return ResultadoEnum.EMPATE;
		}
		if(equipo.equals(equipo1local)) {
			if(goles1local>goles2visitante) {
				return ResultadoEnum.GANADOR;
				} else {
				return ResultadoEnum.PERDEDOR;
			}
		} else {
		//como equipo no es equipo1local, entonces es equipo2visitante
			if(goles2visitante>goles1local) {
				return ResultadoEnum.GANADOR;
				} else {
				return ResultadoEnum.EMPATE;
			}
		}
	}
}