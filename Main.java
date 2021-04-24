package analisisFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		
		Main.leerFichero("problemas2.txt");

	}
	
	public static void leerFichero(String ruta) {
		int contadorPalabras=0;
		int contadorRepetido=0;	

		String linea = "";
		String lineaNueva="";
		String textoEntero="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));			
			try {
				linea = br.readLine();
				
				while (linea != null) {
					String[] partes = linea.split(" ");
					for (int i=0; i<partes.length; i++) {
						
						if(partes[i].endsWith("\"")||partes[i].endsWith(",")||partes[i].endsWith("-")||partes[i].endsWith(")")||partes[i].endsWith(".")||partes[i].endsWith("!")||partes[i].endsWith(";")||partes[i].endsWith(":")||partes[i].endsWith("?")) {
							partes[i]=partes[i].replace(String.valueOf(partes[i].charAt(partes[i].length()-1)), "");
						}
						
						if(partes[i].startsWith(".")||partes[i].startsWith("\"")||partes[i].startsWith("¿")||partes[i].startsWith("(")||partes[i].startsWith("¡")||partes[i].startsWith("-")) {
							partes[i]=partes[i].replace(String.valueOf(partes[i].charAt(0)), "");							
						}
						
						if(partes[i].contains("1")||partes[i].contains("2")||partes[i].contains("3")||partes[i].contains("4")||partes[i].contains("5")||partes[i].contains("6")||partes[i].contains("7")||partes[i].contains("8")||partes[i].contains("9")||partes[i].contains("0")) {
							partes[i]="";							
						}
						partes[i]=partes[i].replaceAll(" ", "");
					}
					for (int i=0; i<partes.length; i++) {	
						if(partes[i].endsWith(",")||partes[i].endsWith("-")||partes[i].endsWith(")")||partes[i].endsWith(".")||partes[i].endsWith("!")||partes[i].endsWith(";")||partes[i].endsWith(":")||partes[i].endsWith("?")) {
							partes[i]=partes[i].replace(String.valueOf(partes[i].charAt(partes[i].length()-1)), "");
						}
						if(partes[i].startsWith("¿")||partes[i].startsWith("(")||partes[i].startsWith("¡")||partes[i].startsWith("-")) {
							partes[i]=partes[i].replace(String.valueOf(partes[i].charAt(0)), "");
						}						
						if(!partes[i].isEmpty()) {
							contadorPalabras++;
						}
						if(partes[i].contains("1")||partes[i].contains("2")||partes[i].contains("3")||partes[i].contains("4")||partes[i].contains("5")||partes[i].contains("6")||partes[i].contains("7")||partes[i].contains("8")||partes[i].contains("9")||partes[i].contains("0")) {
							partes[i]="";
							contadorPalabras--;

						}
						if(partes[i].contains(" ")) {							
							partes[i]=partes[i].replaceAll(" ", "");
						}
						partes[i]=partes[i].replaceAll(" ", "");
						/*lineaNueva=lineaNueva + " "+ partes[i];*/
						
						
							
						System.out.println(partes[i]);

						
						
					}
					
					textoEntero = textoEntero +" "+ lineaNueva;									
					lineaNueva="";
					linea = br.readLine();
					
					
				}
				
				br.close();
				
				
				/*System.out.println(textoEntero);
				textoEntero=textoEntero.replace("   ", " ");
				textoEntero=textoEntero.replace("     ", " ");
				textoEntero=textoEntero.toLowerCase();
				String [] palabrasTexto=textoEntero.split(" ");
				for (int i=0; i<palabrasTexto.length; i++) {
					
					if((!palabrasTexto[i].contains(" "))&&(!palabrasTexto[i].equalsIgnoreCase(""))) {
						
						while (textoEntero.indexOf(palabrasTexto[i]) > -1) {						
						textoEntero = textoEntero.substring(textoEntero.indexOf(
						palabrasTexto[i])+palabrasTexto[i].length(),textoEntero.length());
						contadorRepetido++; 
						}
						
						
						
					}	
					System.out.println(palabrasTexto[i] + " se repite "+ contadorRepetido + " veces.");
					System.out.println("");
					contadorRepetido=0;	

					
					
	
				}
			
				
				
				System.out.println("");
				System.out.println("Palabras totales: "+contadorPalabras);*/
				

				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	

}
