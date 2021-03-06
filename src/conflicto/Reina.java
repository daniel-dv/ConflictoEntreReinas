package conflicto;

import java.util.LinkedList;
import java.util.List;

public class Reina {
	private int fil, col;
	private final int numReina;
	private List<Integer> reinasConflictivas = new LinkedList<Integer>();
	
	
	public Reina(int fil, int col, int numReina) {
		this.fil = fil;
		this.col = col;
		this.numReina=numReina;
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
	
	public void agregarConflictos(Reina [] reina) {
		for (Reina reina2 : reina) {
			if (reina2!=null)
				reinasConflictivas.add(reina2.getNumReina());
		}
		reinasConflictivas.sort(null);
	}


	@Override
	public String toString() {
		String retornar=reinasConflictivas.size()+"";
		for (Integer conflictos : reinasConflictivas)
			retornar+=" "+conflictos;
		return retornar;
	}


	public double distanciaAReina(Reina reina2) {
		if (reina2==null)
			return Double.MAX_VALUE;
		return Math.sqrt(Math.pow(reina2.col-this.col,2)+Math.pow(reina2.fil-this.fil,2));
	}
	
	
	
	
}