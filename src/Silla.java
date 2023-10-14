public class Silla {
	private int idSilla;
	private String nombre;
	private double costo;
	private double precioVenta;
	private int idMaterial;

	// Constructor
	public Silla(int idSilla, String nombre, double costo, double precioVenta, int idMaterial) {
		this.idSilla = idSilla;
		this.nombre = nombre;
		this.costo = costo;
		this.precioVenta = precioVenta;
		this.idMaterial = idMaterial;
	}

	// Getters
	public int getIdSilla() {
		return idSilla;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCosto() {
		return costo;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public int getIdMaterial() {
		return idMaterial;
	}

	@Override
	public String toString() {
		return "|ID silla: " + idSilla + " Nombre: " + nombre + " Costo: " + costo + " Precio de venta: " + precioVenta
				+ " ID material: " + idMaterial + "|";
	}
}
