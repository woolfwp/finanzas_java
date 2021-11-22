
public abstract class Dinero {
	protected double dinero;
	protected String description;
	
	
	public void setDinero(double dinero) {
		this.dinero=dinero;
	}
	
	public double getDinero() {
		return this.dinero;
	}
	
	public void setDescripcion(String descipcion) {
		this.description =descipcion;
	}
	
	public String getDescripcion() {
		return this.description;
	}
}


