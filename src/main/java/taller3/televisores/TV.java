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
		marca = brand;
		estado = state;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca brand) {
		marca = brand;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control cont) {
		control = cont;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int price) {
		precio = price;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		volumen = vol;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int channel) {
		canal = channel;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (canal>=1 && canal<120 && estado == true)
			canal ++;
	}
	public void canalDown() {
		if (canal >1 && canal <=120 && estado == true)
			canal--;
	}
	public void volumenUp() {
		if (volumen >=0 && volumen <7 && estado == true)
			volumen++;
				
	}
	public void volumenDown() {
		if(volumen >0 && volumen <=7 && estado == true)
			volumen--;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	
}
