package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import conflicto.Main;

@DisplayName("Lote de Prueba")
public class ReinaTest {

	private final String rutaSalidaEsperada = "PruebaDeSoftware\\outEsperado\\caso_";
	private final String rutaSalida = "PruebaDeSoftware\\out\\caso_";
	private final String rutaEntrada = "PruebaDeSoftware\\in\\caso_";
	
	@Test
	@DisplayName("Caso 00")
	public void test0() throws NumberFormatException, IOException {
		String numeroCaso = "00";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	

	@Test
	@DisplayName("Caso 01")
	public void test1() throws NumberFormatException, IOException {
		String numeroCaso = "01";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 02")
	public void test2() throws NumberFormatException, IOException {
		String numeroCaso = "02";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 03")
	public void test3() throws NumberFormatException, IOException {
		String numeroCaso = "03";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 04")
	public void test4() throws NumberFormatException, IOException {
		String numeroCaso = "04";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 05")
	public void test5() throws NumberFormatException, IOException {
		String numeroCaso = "05";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 06")
	public void test6() throws NumberFormatException, IOException {
		String numeroCaso = "06";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 07")
	public void test7() throws NumberFormatException, IOException {
		String numeroCaso = "07";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 08")
	public void test8() throws NumberFormatException, IOException {
		String numeroCaso = "08";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 09")
	public void test9() throws NumberFormatException, IOException {
		String numeroCaso = "09";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	@DisplayName("Caso 10")
	public void test10() throws NumberFormatException, IOException {
		String numeroCaso = "10";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.main(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}



	
	
	private void compararArchivosSalida(String pathSalidaEsperada, String pathSalida)
			throws FileNotFoundException, IOException {
		BufferedReader brSalida = new BufferedReader(new FileReader(new File(pathSalida)));
		BufferedReader brSalidaEsperda = new BufferedReader(new FileReader(new File(pathSalidaEsperada)));

		String lineaEsperada;
		while ((lineaEsperada = brSalidaEsperda.readLine()) != null) {
			String lineaSalida = brSalida.readLine();
			assertNotNull(lineaSalida, "La salida tiene más lineas que la esperada");

			assertEquals(lineaEsperada, lineaSalida);
		}
		assertNull(brSalida.readLine(), "La salida tiene más lineas que la esperada");
	}
}
