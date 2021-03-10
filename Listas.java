
public class Listas {

	String comandos [] = new String[25];
	String detalles [] = new String[25];

	Listas() {
	
		comandos [0] = "pwd";
		comandos [1] = "ls";
		comandos [2] = "ls -l";
		comandos [3] = "ls -a";
		comandos [4] = "la -al";
		comandos [5] = "ls -t";
		comandos [6] = "ls -x";
		comandos [7] = "ls -lh";
		comandos [8] = "cd";
		comandos [9] = "cd ..";
		comandos [10] = "cd /";
		comandos [11] = "cd $";
		comandos [12] = "mkdir";
		comandos [13] = "rmdir";
		comandos [14] = "cp";
		comandos [15] = "touch";
		comandos [16] = "cat";
		comandos [17] = "head";
		comandos [18] = "tail";
		comandos [19] = "rm";
		comandos [20] = "mv";
		comandos [21] = "grep";
		comandos [22] = "grep -i";
		comandos [23] = "nl";
		comandos [24] = "apt";
		
		detalles [0] = "muestra la dirección actual en que te encuentras";
		detalles [1] = "Permite desplegar un listado del contenido de la carpeta actual";
		detalles [2] = "muestra mas detallen en la lista";
		detalles [3] = "muestra el contenido oculto de la lista";
		detalles [4] = "permite realizar las dos opciones anteriores(ls -a, ls-al)";
		detalles [5] = "ordena la lista por fecha de codificación";
		detalles [6] = "ordena por nombre y después por extensión";
		detalles [7] = "muestra la información en KB, MB";
		detalles [8] = "permite movilizarte entre directorios";
		detalles [9] = "se moviliza a la carpeta padre de tu ubicación";
		detalles [10] ="te moviliza a la carpeta raiz del sistema operativo.";
		detalles [11] ="te moviliza a la carpeta del usuario.";
		detalles [12] ="permite crear un directorio nuevo";
		detalles [13] ="permite eliminar un directorio";
		detalles [14] ="permite copiar un archivo especificando el nombre";
		detalles [15] ="con este comando puedes crear un documento .txt";
		detalles [16] ="podemos crear un .txt y ver el contenido de un archivo";
		detalles [17] ="el comando head seguido del nombre de un archivo muestra el contenido de las primeras líneas";
		detalles [18] ="este comando realiza todo lo contrario del comando head";
		detalles [19] ="permite eliminar un archivo, especificando";
		detalles [20] ="permite movilizar un archivo de un directorio a otro";
		detalles [21] ="este comando permite localizar entre las líneas del documento si existe la palabra que le indiquemos";
		detalles [22] ="permite búsqueda sin límite de mayúscula";
		detalles [23] ="muestra el documento con la lineas enumeradas";
		detalles [24] ="este se utiliza para las distribuciones de linux basadas en Debian tales como ubuntu.";
	}
}
