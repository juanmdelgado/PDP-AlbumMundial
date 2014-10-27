package co.poli.modelo;

public class Lamina {
	
	protected static final String TIPO_P = "JUGADOR";
	protected static final String TIPO_T = "EQUIPO";
	protected static final String TIPO_C = "ESTADIO";
	protected static final String TIPO_S = "ESCUDO";
	
	protected int id;
	protected String nombre;
	protected String tipo;
	protected String pathImagen;
	
	public Lamina (int id, String nombre, String tipo, String pathImagen){
		this.setId(id);
		this.setNombre(nombre);
		this.setTipo(tipo);
		this.setPathImagen(pathImagen);
	}
	
	public Lamina (){
		
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPathImagen() {
		return pathImagen;
	}

	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}

}
