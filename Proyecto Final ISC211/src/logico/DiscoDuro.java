package logico;

public class DiscoDuro extends Componente {

	private Double capacidad;
	private String conexion;	

	public DiscoDuro(String marca, Double precio, int cantidad, String numeroSerie, String modelo, Double capacidad, String conexion) {
		super(marca, precio, cantidad, numeroSerie, modelo);
		this.capacidad = capacidad;
		this.conexion = conexion;
	}


	public Double getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}


	public String getConexion() {
		return conexion;
	}


	public void setConexion(String conexion) {
		this.conexion = conexion;
	}
}