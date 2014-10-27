package co.poli.modelo;

public class Jugador extends Lamina{
	
	private String posicion;
	private float estatura;
	private int edad;
	private String fechaNace;
	private String equipoActual;
	private String paisEquipoActual;
	private String primerPartido;
	private String fechaPrimerPartido;
	
	public Jugador (int id, String nombre, String tipo, String pathImagen, String posicion, float estatura, int edad, 
			String fechaNace, String equipoActual, String paisEquipoActual, String primerPartido, String fechaPrimerPartido){
		super (id, nombre, tipo, pathImagen);
		this.setTipo(TIPO_P);
		this.setPosicion(posicion);
		this.setEstatura(estatura);
		this.setEdad(edad);
		this.setFechaNace(fechaNace);
		this.setEquipoActual(equipoActual);
		this.setPaisEquipoActual(paisEquipoActual);
		this.setPrimerPartido(primerPartido);
		this.setFechaPrimerPartido(fechaPrimerPartido);
	}
	
	public Jugador (){

	}
	
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public String getFechaNace() {
		return fechaNace;
	}

	public void setFechaNace(String fechaNace) {
		this.fechaNace = fechaNace;
	}

	public String getEquipoActual() {
		return equipoActual;
	}

	public void setEquipoActual(String equipoActual) {
		this.equipoActual = equipoActual;
	}

	public String getPaisEquipoActual() {
		return paisEquipoActual;
	}

	public void setPaisEquipoActual(String paisEquipoActual) {
		this.paisEquipoActual = paisEquipoActual;
	}

	public String getPrimerPartido() {
		return primerPartido;
	}

	public void setPrimerPartido(String primerPartido) {
		this.primerPartido = primerPartido;
	}

	public String getFechaPrimerPartido() {
		return fechaPrimerPartido;
	}

	public void setFechaPrimerPartido(String fechaPrimerPartido) {
		this.fechaPrimerPartido = fechaPrimerPartido;
	}

}
