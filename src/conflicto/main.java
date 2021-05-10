package conflicto;

import java.util.List;

public class Main {

	public static void main(String[] args) {


		Archivo archivoEntrada = new Archivo("reinas.in");

		List<String> datos;

		datos = archivoEntrada.leerArchivo();
		
		String[] primerLinea = datos.get(0).split(" ");
		
		Tablero tablero = new Tablero (Integer.parseInt(primerLinea[0]), Integer.parseInt(primerLinea[1]));
		
		for (int i=1; i<=Integer.parseInt(primerLinea[1]); i++) {
			String[] lineas = datos.get(i).split(" ");
			tablero.agregarReina(new Reina(Integer.parseInt(lineas[0]),Integer.parseInt(lineas[1])));
		}

		tablero.procesar();
		
		new Archivo ("reinas.out").escribirArchivo (tablero.toString());
		
		tablero.mostrarReinas();
	}

}
