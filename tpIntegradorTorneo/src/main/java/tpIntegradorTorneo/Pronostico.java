package tpIntegradorTorneo;

public class Pronostico {
	
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum prediccion;
	
										//Constructor Auto
	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum prediccion) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.prediccion = prediccion;
	}
										//Sólo get auto, agrego "this"
	public Partido getPartido() {
		return this.partido;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public ResultadoEnum getPrediccion() {
		return this.prediccion;
	}
										//Metodo
	public int puntos() {
		//this.prediccion = 
		ResultadoEnum resultadoPartido = this.partido.resultado(this.equipo);
		if(this.prediccion.equals(resultadoPartido)) {
			return 1;
	} else {
			return 0;
		}
	}
}