package co.poli.modelo;

public class Estadio extends Lamina{
	private String ciudad;
	private int capacidad;
	private int fecha;
	
	public Estadio(int id, String nombre, String tipo, String pathImage, String ciudad, int capacidad, int fecha){
		super(id, nombre, tipo, pathImage);
		this.setTipo(TIPO_C);
		this.setCiudad(ciudad);
		this.setCapacidad(capacidad);
		this.setFecha(fecha);
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
}
