import java.util.List;

public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;

	public Cuenta(Usuario usuario){
		this.usuario = usuario;
		this.saldo=0;
		this.gastos= null;
		this.ingresos = null;
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


	public List<Gasto> getGastos() {
		return gastos;
	}


	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public double addIngresos(String description, double cantidad) {
		this.saldo= this.saldo + cantidad;
		return this.saldo;
	}
	
	public double addGastos(String description, double cantidad) {
		this.saldo = this.saldo - cantidad;
		return this.saldo;
		
	}
	
	public String toString() {
		return "Bienvendo " + usuario.getNombre() +"\n"+ "Tu saldo actual es de: " + this.saldo;
	}
	
}