import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;

	public Cuenta(Usuario usuario){
		this.usuario = usuario;
		this.saldo=0;
		this.gastos= new ArrayList<Gasto>();
		this.ingresos = new ArrayList<Ingreso>();
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos=gastos;
	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	public void setIngresos(List<Ingreso> ingreso){
		this.ingresos=ingreso;
	} 

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public double addIngresos(String description, double cantidad) {
		Ingreso nuevoIngreso = new Ingreso(cantidad, description);
		this.ingresos.add(nuevoIngreso);
		
		this.saldo= this.saldo + cantidad;
		return this.saldo;
	}
	
	public double addGastos( String description, double cantidad) {
		
		Gasto nuevoGasto = new Gasto(cantidad, description);
		this.gastos.add(nuevoGasto);
		
		this.saldo = this.saldo - cantidad;
		return this.saldo;
		
		
		
	}
	
	public String toString() {
		return "Bienvendo " + usuario.getNombre() +"\n"+ "Tu saldo actual es de: " + this.saldo;
	}
	
}