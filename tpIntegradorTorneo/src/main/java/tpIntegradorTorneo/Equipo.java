package tpIntegradorTorneo;

public class Equipo {
	
	private String nombre;
    private String descripcion;

  //Constructor
  		public Equipo(String nombre) {
  		super();
  		this.nombre = nombre;
  	}
  	
  	//Get - Set
  	public String getNombre() {
  		return nombre;
  	}
  		//Borre el setNombre x q no voy a cambiar nombre de equipo
  	
  	public String getDescripcion() {
  		return descripcion;
  	}
  	public void setDescripcion(String descripcion) {
  		this.descripcion = descripcion;
  	}
}
