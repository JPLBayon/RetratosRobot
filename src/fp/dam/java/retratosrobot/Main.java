package fp.dam.java.retratosrobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static String [][] opciones = {
			{"el pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||"},
			{"los ojos", "|  o o  |", "| (· ·) |", "| (O O) |", "| \\   / |"},
			{"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
			{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
			{"la barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	public static void main(String[] args) throws IOException {
		System.out.print("Crear retrato Robot (s/n) : ");
		String respuesta = in.readLine();
		while (respuesta.equalsIgnoreCase("s")) {
			crearRetrato();
			System.out.print("Crear retrato Robot (s/n) : ");
			respuesta = in.readLine();
		}
	}
	
	public static void crearRetrato() throws IOException {
		String [] retrato = new String[opciones.length];
		for (int i=0; i<opciones.length; i++)
			retrato[i] = elegirOpcion(i);
		for (int i=0; i<opciones.length; i++)
			System.out.println(retrato[i]);
	}
	
//	public static String elegirOpcion(int i) throws IOException {
//		int op;
//		do {
//			System.out.println("Elige una opción para " + opciones[i][0]);
//			for (int j=1; j<opciones[i].length; j++)
//				System.out.println(j + " - " + opciones[i][j]);
//			System.out.print("Opcion (1 a " + (opciones[i].length - 1) + "): ");
//			op = Integer.parseInt(in.readLine());
//			if (op < 1 || op > (opciones[i].length - 1))
//				System.out.println("Opción incorrecta, inténtalo de nuevo");
//		} while (op < 1 || op > 4);
//		return opciones[i][op];
//	}
	
	public static String elegirOpcion(int i) throws IOException {
		do {
			System.out.println("Elige una opción para " + opciones[i][0]);
			for (int j=1; j<opciones[i].length; j++)
				System.out.println(j + " - " + opciones[i][j]);
			System.out.print("Opcion (1 a " + (opciones[i].length - 1) + "): ");
			try {
				return opciones[i][Integer.parseInt(in.readLine())];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Opción incorrecta, inténtalo de nuevo");
			}
		} while (true);
	}

}
