package conflicto;

import java.util.List;
import java.util.LinkedList;

public class Tablero {
	private int n;
	private int cantReinas;
	private List<Reina> reinas = new LinkedList<Reina>();

	public Tablero(int n, int cantReinas) {
		this.n = n;
		this.cantReinas = cantReinas;
	}

	public boolean agregarReina(Reina reina) {
		if (cantReinas > reinas.size() && reina.getCol() <=n && reina.getFil() <=n) {
			reinas.add(reina);
			return true;
		}
		else
			return false;
	}

	public void calcularConflictos() {
		for (Reina reina : reinas) {
			Reina[] conflictos = new Reina[8];
			// En este vector se guardan los conflictos que se analizan,
			//Se analizan en el siguiente orden, tomando a la reina de analisis (a la iterada: "reina") como centro relativo:
			/*
			 * 1- Por fila a derecha
			 * 2. Por fila a izquierda
			 * 3. Por columna hacia abajo
			 * 4. Por columna hacia arriba
			 * 5. Por diagonales paralelas a la secundaria, hacia abajo
			 * 6. Por diagonales paralelas a la secundaria, hacia arriba
			 * 7. Por diagonales paralelas a la principal, hacia abajo
			 * 8. Por diagonales paralelas a la principal, hacia arriba

			 */
			

			for (Reina reina2 : reinas) {
				if (!reina.equals(reina2)) {
					// POR FILA
					if (reina.getFil() == reina2.getFil()) {
						// busco reinaConflictiva a derecha
						if (reina.getCol() < reina2.getCol())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[0]))
								conflictos[0] = reina2;
						// busco reinaConflictiva a izquierda
						if (reina.getCol() > reina2.getCol())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[1]))
								conflictos[1] = reina2;
					}
					// POR COLUMNA
					else if (reina.getCol() == reina2.getCol()) {
						// busco reinaConflictiva hacia abajo
						if (reina.getFil() < reina2.getFil())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[2]))
								conflictos[2] = reina2;
						// busco reinaConflictiva hacia arriba
						if (reina.getFil() > reina2.getFil())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[3]))
								conflictos[3] = reina2;
					}
					// por diagonal SECUNDARIA
					else if (reina.getFil() + reina.getCol() == reina2.getFil() + reina2.getCol()) {
						// POR DIAGONAL SECUNDARIA HACIA ABAJO
						// busco reinaConflictiva por diagonal secundaria hacia izquierda-abajo
						if (reina.getFil() < reina2.getFil())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[4]))
								conflictos[4] = reina2;
						// POR DIAGONAL SECUNDARIA HACIA ARRIBA
						// busco reinaConflictiva por diagonal secundaria hacia derecha-arriba
						if (reina.getFil() > reina2.getFil())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[5]))
								conflictos[5] = reina2;
					}
					// POR DIAGONAL PRINCIPAL
					else if (reina.getFil() - reina.getCol() == reina2.getFil() - reina2.getCol()) {
						// POR DIAGONAL PRINCIPAL HACIA ABAJO
						// busco reinaConflictiva por diagonal principal hacia derecha-abajo
						if (reina.getFil() < reina2.getFil())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[6]))
								conflictos[6] = reina2;
						// POR DIAGONAL PRINCIPAL HACIA ARRIBA
						// busco reinaConflictiva por diagonal principal hacia izquierda-arriba
						if (reina.getFil() > reina2.getFil())
							if (reina.distanciaAReina(reina2) < reina.distanciaAReina(conflictos[7]))
								conflictos[7] = reina2;
					}

				}
			}
			reina.agregarConflictos(conflictos);
		}
	}

	@Override
	public String toString() {
		String salida = "";
		if (this.reinas.size()==0)
			return salida; //caso especial: hay 0 reinas
		for (Reina reina : reinas) {
			salida+=reina+"\n";
			}
		return salida;
	}
	
	

}
