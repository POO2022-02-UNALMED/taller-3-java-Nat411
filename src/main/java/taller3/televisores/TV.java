package taller3.televisores;
//package televisores;

public class TV {
	private Marca marca;
	int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	private static int numTV;
	
	public TV(Marca brand, boolean state) {
		this.marca = brand;
		this.estado = state;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca brand) {
		this.marca = brand;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control cont) {
		this.control = cont;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int price) {
		this.precio = price;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		this.volumen = vol;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int channel) {
		this.canal = channel;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (this.canal>=1 && this.canal<120 && this.estado == true)
			this.canal ++;
	}
	public void canalDown() {
		if (this.canal >1 && this.canal <=120 && this.estado == true)
			this.canal--;
	}
	public void volumenUp() {
		if (this.volumen >=0 && this.volumen <7 && this.estado == true)
			this.volumen++;
				
	}
	public void volumenDown() {
		if(this.volumen >0 && this.volumen <=7 && this.estado == true)
			this.volumen--;
	}
	public static void setNumTV(int num) {
		TV.numTV = num;
	}
	
}
