import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		app();
		
	}
	
	private static void app() {
		
		Usuario crearUsuario = new Usuario();
		String nombreusu;
		int edadusu;
		String dniusu;
		Cuenta nuevaCuenta;
		
		nombreusu = JOptionPane.showInputDialog("Ingresa el nombre del usuario");
		crearUsuario.setNombre(nombreusu);
		
		edadusu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del usuario"));
		crearUsuario.setEdad(edadusu);
		
		dniusu = JOptionPane.showInputDialog("Ingresa el DNI del usuario");
		crearUsuario.setDni(dniusu);
		
		JOptionPane.showMessageDialog(null, "los datos del usuario son: \n" + crearUsuario.toString());
		
		nuevaCuenta = new Cuenta(crearUsuario);
		
		
		int opcion =0;
		int menu = 0;
	
		do {
				menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido selecciono menu, Elija: \n"
																		  +"1.Añadir nuevo gasto \n" +
																		   "2.Añadir nuevo ingreso \n" +
																		   "3. Mostrar Gastos \n" + 
																			"4. Mostrar ingresos \n" + 
																			"5. Mostrar Saldo \n" + 
																			"6. Salir","Menu" ,3));
				
				switch(menu) {
				case 1:
					JOptionPane.showMessageDialog(null, "Bienvenido, Selecciono Añadir nuevo gasto");
					JOptionPane.showMessageDialog(null, "");
					break;
				
				case 2:
					JOptionPane.showMessageDialog(null, "Bienvenido, Selecciono Añadir nuevo ingreso");
					JOptionPane.showMessageDialog(null, "");
					break;
				
				case 3:
					JOptionPane.showMessageDialog(null, "Bienvenido, Selecciono mostrar gastos");
					JOptionPane.showMessageDialog(null, "");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Bienvenido, Selecciono mostrar ingresos");
					JOptionPane.showMessageDialog(null, "");
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Bienvenido, Selecciono mostrar saldo");
					JOptionPane.showMessageDialog(null, nuevaCuenta.toString());
					
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Hasta pronto");
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Ingrese un valor valido entre 1 y 6");
					break;
				}
					
		}while(opcion > 0 && opcion <=6);
		
	}
	

}
