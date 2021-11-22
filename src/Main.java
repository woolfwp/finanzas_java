

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		app();
		
	}
	private static Usuario crearUsuario = new Usuario();
	private static List<Gasto> listaGastos = new ArrayList<Gasto>();
	private static List<Ingreso> listaIngresos = new ArrayList<Ingreso>();
	private static String nombreusu;
	private static int edadusu;
	private static String dniusu;
	private static Cuenta nuevaCuenta = null;
	private static String descripcionMovimiento = "";
	private static double valorMovimiento = 0;


	
	private static void añadirGastos() {
		JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreusu +" Selecciono Añadir nuevo gasto");
		
		
		valorMovimiento= Integer.parseInt(JOptionPane.showInputDialog(nombreusu + " Ingresa el valor del movimiento "));
		descripcionMovimiento= JOptionPane.showInputDialog(nombreusu +"  Ingresa la descripcion del gasto");
		
		nuevaCuenta.addGastos(descripcionMovimiento, valorMovimiento);
		JOptionPane.showMessageDialog(null, nombreusu + " El gasto fue creado con exito");
	}
	
	

	private static void añadirIngresos() {
			JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreusu + " Selecciono Añadir nuevo ingreso");
		

			valorMovimiento= Integer.parseInt(JOptionPane.showInputDialog(nombreusu +" Ingresa el valor del movimiento "));
			descripcionMovimiento= JOptionPane.showInputDialog(nombreusu +" Ingresa la descripcion del ingreso");
			
			nuevaCuenta.addIngresos(descripcionMovimiento, valorMovimiento);
			JOptionPane.showMessageDialog(null,nombreusu + " El ingreso fue creado con exito");
			
	}
	
	private static void mostrarGastos() {
		JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreusu +"  Selecciono mostrar gastos");
		
		listaGastos = nuevaCuenta.getGastos();
		
		if(listaGastos.isEmpty()) {
			JOptionPane.showMessageDialog(null,  nombreusu + " Aun no ha añadido Gastos");
		}else {
			
			for(int x=0;x<listaGastos.size();x++) {
				JOptionPane.showMessageDialog(null, nombreusu + " Tu gasto numero "+ x +" ha  sido: " + listaGastos.get(x));
			}
			
		}
	}
	
	private static void mostrarIngresos() {
		JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreusu + " Selecciono mostrar ingresos");
		
		listaIngresos = nuevaCuenta.getIngresos();
		
		if(listaIngresos.isEmpty()) {
			JOptionPane.showMessageDialog(null, nombreusu + " Aun no ha añadido ingresos");
		}else {
			
			for(int x=0;x<listaIngresos.size();x++) {
				JOptionPane.showMessageDialog(null, nombreusu + " Tu ingreso numero "+ x +" ha  sido: " + listaIngresos.get(x));
			}
			
		}
	}

	
	private static void app() {
		

		
		nombreusu = JOptionPane.showInputDialog("Ingresa el nombre del usuario");
		crearUsuario.setNombre(nombreusu);
		
		edadusu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del usuario"));
		crearUsuario.setEdad(edadusu);
		
		dniusu = JOptionPane.showInputDialog("Ingresa el DNI del usuario");
		crearUsuario.setDni(dniusu);
		
		JOptionPane.showMessageDialog(null, "los datos del usuario son: \n" + crearUsuario.toString());
		
		nuevaCuenta = new Cuenta(crearUsuario);
		
		
		
		int menu = 0;
	
		do {
				menu = Integer.parseInt(JOptionPane.showInputDialog(null, nombreusu +" Bienvenido a tu menu principal, Elije: \n"
																		  +"1.Añadir nuevo gasto \n" +
																		   "2.Añadir nuevo ingreso \n" +
																		   "3. Mostrar Gastos \n" + 
																			"4. Mostrar ingresos \n" + 
																			"5. Mostrar Saldo \n" + 
																			"6. Salir","Menu" ,3));
				
				switch(menu) {
				case 1:
					añadirGastos();
					break;
				case 2:
					añadirIngresos();
					break;
				case 3:
					mostrarGastos();
					break;
				case 4:
					mostrarIngresos();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Bienvenido, "+nombreusu +" Selecciono mostrar saldo");
					JOptionPane.showMessageDialog(null, nuevaCuenta.toString());
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Hasta pronto " + nombreusu );
					System.exit(0);
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Ingrese un valor valido entre 1 y 6 " + nombreusu );
					break;
				}
					
		}while(menu > 0 && menu <=6);
		
	}
	

}
