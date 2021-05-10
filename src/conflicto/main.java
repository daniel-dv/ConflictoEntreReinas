package conflicto;

public class main {

	public static void main(String[] args) {
		Tablero tablero = new Tablero (8,2);
		tablero.agregarReina(new Reina(2,1));
		tablero.agregarReina(new Reina(8,2));
		tablero.agregarReina(new Reina(1,3));
		tablero.agregarReina(new Reina(3,4));
		tablero.agregarReina(new Reina(6,5));
		tablero.agregarReina(new Reina(4,6));
		tablero.agregarReina(new Reina(7,7));
		tablero.agregarReina(new Reina(5,8));
		tablero.agregarReina(new Reina(3,5));
		tablero.agregarReina(new Reina(3,6));
		
		
		//tablero.agregarReina(new Reina(,0));
		//System.out.println(tablero);
		tablero.procesar();
		tablero.mostrarReinas();
	}

}
