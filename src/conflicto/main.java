package conflicto;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		//main es el nexo entre la clase archivo y las clases reina/tablero
		
		List<String> datos = new Archivo("reinas.in").leerArchivo();

		String[] primerLinea = datos.get(0).split(" ");

		Tablero tablero = new Tablero(Integer.parseInt(primerLinea[0]), Integer.parseInt(primerLinea[1]));

		for (int i = 1; i <= Integer.parseInt(primerLinea[1]); i++) {
			String[] lineas = datos.get(i).split(" ");
			tablero.agregarReina(new Reina(Integer.parseInt(lineas[0]), Integer.parseInt(lineas[1]), i));
		}

		tablero.calcularConflictos();
		new Archivo("salida.out").escribirArchivo(tablero.toString());
	}
	
	
	public static void main(String entrada, String salida) {
		//main es el nexo entre la clase archivo y las clases reina/tablero

		List<String> datos = new Archivo(entrada).leerArchivo();

		String[] primerLinea = datos.get(0).split(" ");

		Tablero tablero = new Tablero(Integer.parseInt(primerLinea[0]), Integer.parseInt(primerLinea[1]));

		for (int i = 1; i <= Integer.parseInt(primerLinea[1]); i++) {
			String[] lineas = datos.get(i).split(" ");
			tablero.agregarReina(new Reina(Integer.parseInt(lineas[0]), Integer.parseInt(lineas[1]), i));
		}

		tablero.calcularConflictos();

		new Archivo(salida).escribirArchivo(tablero.toString());
	}


}
