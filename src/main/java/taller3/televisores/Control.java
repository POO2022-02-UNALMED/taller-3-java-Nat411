package taller3.televisores;
//package televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public void setCanal(int canal) {
		this.tv.canal = canal;
	}
	public void enlazar(TV televisor) {
		this.tv = televisor;
		tv.control = this;
	}
	public TV gettTv() {
		return tv;
	}
	public void setTv(TV televisor) {
		tv = televisor;
	}
}
