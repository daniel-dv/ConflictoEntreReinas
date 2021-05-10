package conflicto;


import java.util.List;
import java.util.LinkedList;


public class Tablero {
	private int n;
	private int cantReinas;
	private List<Reina> reinas= new LinkedList<Reina>();
	//private Reina [][] matReinas = new Reina[n][n];
	

	public Tablero(int n, int cantReinas) {
		this.n = n;
		this.cantReinas = cantReinas;
	}
	
	public void agregarReina (Reina reina) {
		reinas.add(reina);
	}

	public void procesar() {
		for (Reina reina : reinas) {
			//declaron reinas conflictivas
			//mejorar y preguntar en .add si no es null y se obvia los ifs ultimos
			Reina reinaFilSig=null;
			Reina reinaFilAnt=null;
			Reina reinaColSig=null;
			Reina reinaColAnt=null;
			Reina reinaDiagPrinSig=null;
			Reina reinaDiagPrinAnt=null;
			Reina reinaDiagSecSig=null;
			Reina reinaDiagSecAnt=null;
			
			
			for (Reina reina2 : reinas) {
				if (!reina.equals(reina2)) {
					//POR FILA
					if (reina.getFil()==reina2.getFil()) {
						//POR FILA HACIA ADELANTE
						if (reina.getCol()<reina2.getCol())
							if (reinaFilSig==null)
								reinaFilSig=reina2;
							else {
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaFilSig))
									reinaFilSig=reina2;
							}
						//POR FILA HACIA ATRAS
						if (reina.getCol()>reina2.getCol())
							if(reinaFilAnt==null)
								reinaFilAnt=reina2;
							else
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaFilAnt))
									reinaFilAnt=reina2;
					}
					//POR COLUMNA
					else if (reina.getCol()==reina2.getCol()) {
						//POR COLUMNA HACIA ABAJO
						if (reina.getFil()<reina2.getFil())
							if (reinaColSig==null)
								reinaColSig=reina2;
							else {
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaColSig))
									reinaColSig=reina2;
							}
						//POR FILA HACIA ATRAS
						if (reina.getFil()>reina2.getFil())
							if(reinaColAnt==null)
								reinaColAnt=reina2;
							else
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaColAnt))
									reinaColAnt=reina2;
					}
					//por diagonal SECUNDARIA
					else if (reina.getFil()+reina.getCol()==reina2.getFil()+reina2.getCol()) {
						//POR DIAGONAL SECUNDARIA HACIA ABAJO
						if (reina.getFil()<reina2.getFil())
							if (reinaDiagSecSig==null)
								reinaDiagSecSig=reina2;
							else {
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaDiagSecSig))
									reinaDiagSecSig=reina2;
							}
						//POR DIAGONAL SECUNDARIA HACIA ARRIBA
						if (reina.getFil()>reina2.getFil())
							if(reinaDiagSecAnt==null)
								reinaDiagSecAnt=reina2;
							else
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaDiagSecAnt))
									reinaDiagSecAnt=reina2;
					}
					//POR DIAGONAL PRINCIPAL
					else if (reina.getFil()-reina.getCol()==reina2.getFil()-reina2.getCol()) {
						//POR DIAGONAL PRINCIPAL HACIA ABAJO
						if (reina.getFil()<reina2.getFil())
							if (reinaDiagPrinSig==null)
								reinaDiagPrinSig=reina2;
							else {
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaDiagPrinSig))
									reinaDiagPrinSig=reina2;
							}
						//POR DIAGONAL PRINCIPAL HACIA ARRIBA
						if (reina.getFil()>reina2.getFil())
							if(reinaDiagPrinAnt==null)
								reinaDiagPrinAnt=reina2;
							else
								if (reina.distanciaAReina(reina2)<reina.distanciaAReina(reinaDiagPrinAnt))
									reinaDiagPrinAnt=reina2;
					}
					
				}	
			}
			
			if (reinaFilSig!=null) 
				reina.agregarConflicto(reinaFilSig);
			
			if (reinaFilAnt!=null)
				reina.agregarConflicto(reinaFilAnt);
			
			if (reinaColSig!=null)
				reina.agregarConflicto(reinaColSig);
			
			if (reinaColAnt!=null)
				reina.agregarConflicto(reinaColAnt);
			
			if (reinaDiagPrinSig!=null)
				reina.agregarConflicto(reinaDiagPrinSig);
			
			if (reinaDiagPrinAnt!=null)
				reina.agregarConflicto(reinaDiagPrinAnt);
			
			if (reinaDiagSecSig!=null)
				reina.agregarConflicto(reinaDiagSecSig);
			
			if (reinaDiagSecAnt!=null)
				reina.agregarConflicto(reinaDiagSecAnt);
			
			
		}
	}
	
	public void mostrarReinas (){
		for (Reina reina : reinas) {
			System.out.println(reina);
		}
	}


	
	


	

}
