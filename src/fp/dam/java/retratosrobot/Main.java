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
	
	public static String elegirOpcion(int i) throws IOException {
//		String resultado = null;
//		int op;
//		do {
//			System.out.println("Elige una opción para " + rasgo);
//			System.out.println("1 - " + op1);
//			System.out.println("2 - " + op2);
//			System.out.println("3 - " + op3);
//			System.out.println("4 - " + op4);
//			System.out.print("Opcion (1 a 4): ");
//			op = Integer.parseInt(in.readLine());
//			switch (op) {
//			case 1: resultado =  op1; break;
//			case 2: resultado =  op2; break;
//			case 3: resultado =  op3; break;
//			case 4: resultado =  op4; break;
//			default: System.out.println("opcion incorrecta, inténtalo de nuevo");
//			}
//		} while (op < 1 || op > 4);
//		return resultado;
	}

}
