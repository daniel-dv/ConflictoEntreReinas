package conflicto;

import java.util.LinkedList;
import java.util.List;

public class Reina {
	private int fil, col;
	private final int numReina;
	private static int cantReinas=1;
	private List<Integer> reinasConflictivas = new LinkedList<Integer>();
	
	
	public Reina(int fil, int col) {
		this.fil = fil;
		this.col = col;
		this.numReina=cantReinas++;
	}


	public int getFil() {
		return fil;
	}


	public int getCol() {
		return col;
	}


	public int getNumReina() {
		return numReina;
	}
	
	public List <Integer> getConflictos (){
		return reinasConflictivas;
	}
	
	public void agregarConflicto(Reina reina) {
		reinasConflictivas.add(reina.getNumReina());
		reinasConflictivas.sort(null);
	}

//
//	@Override
//	public String toString() {
//		return "Reina " + numReina+": " + fil + "," + col +" Tiene conflictos con reinas: "+ this.reinasConflictivas;
//	}
	
	@Override
	public String toString() {
		String retornar=reinasConflictivas.size()+" ";
		for (Integer conflictos : reinasConflictivas) {
			retornar+=conflictos+" ";
		}
		return retornar;
	}


	public double distanciaAReina(Reina reina2) {
		return Math.sqrt(Math.pow(reina2.col-this.col,2)+Math.pow(reina2.fil-this.fil,2));
	}
	
	
	
	
	
}