package conflicto;

import java.io.BufferedReader;
import java.io.FileReader;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;



public class Archivo {
	
	private String nombreArchivo;
	
	public Archivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void escribirArchivoEnteros() throws IOException {

		FileWriter archivo = new FileWriter(this.nombreArchivo);
		PrintWriter pw = new PrintWriter(archivo);

		for (int i = 0; i < (int) Math.floor(Math.random() * (20000 - 10000 + 1) + 10000); i++)
			pw.println((int) Math.floor(Math.random() * 12001));

		archivo.close();

	}
	
	

	public List<String> leerArchivo() {
	   File archivo = null;
	   FileReader fr = null;
	   BufferedReader br = null;
      try {
         archivo = new File (this.nombreArchivo);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         List <String> lineas = new LinkedList <String>();
         String linea;
         
         while((linea=br.readLine())!=null)
            lineas.add(linea);
         return lineas;
         
      }
      catch(Exception e){
         e.printStackTrace();
      }
      finally{
         try{                    
            if( fr != null ){   
               fr.close(); 

            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return null;
     
   }

	public void escribirArchivo (String datos) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(this.nombreArchivo);
            pw = new PrintWriter(fichero);

            pw.println(datos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
        	   if (null != fichero)
        		   fichero.close();
           } catch (Exception e2) {
        	   e2.printStackTrace();
           }
        }
	}

}
