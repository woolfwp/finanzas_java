
public class Gasto extends Dinero{

	public Gasto(double gasto, String description) {
		this.dinero = gasto;
		this.description = description;
	}
	
	public String toString() {
		return "El gasto en cocepto de: " + this.description;
	}
}
