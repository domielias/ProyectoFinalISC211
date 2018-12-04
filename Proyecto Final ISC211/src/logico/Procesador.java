package logico;

import java.io.Serializable;

public class Procesador extends Componente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String socket;
	private Double velocidad;


	public Procesador(String marca, Double precioCompra, int cantidad, String numeroSerie, String modelo,
			Double precioVenta,String proveedor,String socket,Double velocidad) {
		super(marca, precioCompra, cantidad, numeroSerie, modelo, precioVenta,proveedor);
		this.socket = socket;
		this.velocidad = velocidad;
	}

	public String getSocket() {
		return socket;
	}
	
	public String toString()
	{
		String toString = marca + " " + modelo + " - " + "RD$ " +  precioVenta ;
		return toString ;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
}
