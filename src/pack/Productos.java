package pack;

public class Productos {
	private String nombre;
	private double precio;
	private int dias_caducar;
	private String tipo;
	
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Productos(String nombre, double precio,int dias_caducar) {
		this.nombre = nombre;
		this.precio = precio;
		this.dias_caducar=dias_caducar;
	}
	
	public Productos(String nombre, double precio,String tipo) {
		this.nombre = nombre;
		this.precio = precio;
		this.tipo=tipo;
	}
	
	public class Perecedero extends Productos {
		public Perecedero(String nombre, double precio, int dias_caducar) {
			super(nombre,precio,dias_caducar);
		}
	}
	
	public class noPerecedero extends Productos {
		public noPerecedero(String nombre, double precio, int tipo) {
			super(nombre,precio,dias_caducar);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDias_caducar() {
		return dias_caducar;
	}

	public void setDias_caducar(int dias_caducar) {
		this.dias_caducar = dias_caducar;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Productos nombre=" + nombre + ", precio=" + precio + ", dias_caducar=" + dias_caducar + ", tipo="
				+ tipo + "";
	}
	
	
	
	
	
	
}
