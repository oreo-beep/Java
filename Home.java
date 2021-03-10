import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		
		//INSTANCIA DE CLASE.
		Listas producto = new Listas();
		Usuarios usuario = new Usuarios();
		
		
		String exit="exit";
		String cerrar ="cerrar";
		String programaEncendido = "ON";
		int intentos = 0;
		
		do {
			
			Scanner datoUserName = new Scanner(System.in);//<--- INGRESO DE USUARIO
			System.out.println("     Listado de Comandos ");
			System.out.println("----------------------------------");
			System.out.print("user: ");
			String user = datoUserName.nextLine();
			
			for(int j = 0; j<3;j++) {//2     0 1
			
				if(user.equals(usuario.userName[j])) {
					
					Scanner datoPassword = new Scanner(System.in); //<-- INGRESO DE LA CONTRASEÑA
					System.out.print("password: ");
					String pass = datoPassword.nextLine();
					
					if(pass.contentEquals(usuario.password[j])) {
						
						
						
						do {
							Scanner datoCodigo = new Scanner(System.in);//<-- INGRESAMOS CÓDIGO DEL PRODUCTO
							System.out.println("------------------------------------");
							System.out.print("Comandos a buscar: ");
							String rCodigo = datoCodigo.nextLine();//a001
							System.out.println("------------------------------------");
							
							
							if(rCodigo.equalsIgnoreCase("exit")) {
								
								exit="salir";
							}else {
								
								for(int i = 0;i<producto.comandos.length;i++) {
									
									if(rCodigo.equals(producto.comandos [i])) {
										
										System.out.println("comandos:       "+producto.comandos [i]);
										System.out.println("detalles:       "+producto.detalles [i]);
									}
								}
								
							}
						}while(exit.equalsIgnoreCase("exit"));//false
						

					}else {
						System.out.println("Contraseña incorrecta");
						intentos++;
					}
					
				
				}
				
				else if(user.equalsIgnoreCase("off")) {
					
					programaEncendido = "off";
				}
			}
			
		}while(programaEncendido.equalsIgnoreCase("ON"));//true
		
		
	}

}
