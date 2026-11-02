
import java.util.Scanner;


public class PiInteractivo{

public static void main (String [] args){

	int dardosALanzar = 0;
	int dardosLanzados = 0;
	int dardosDentro =0;
	double abscisa;
	double ordenada;
	double distanciaAlOrigen;
	double estimacionPi;
	Scanner introducirEntero = new Scanner (System.in);
	

System.out.println("========ESTIMACION DE PI A DARDAZOS========\n");
System.out.println("Ingrese el numero de dardos a lanzar: \n");



	while (introducirEntero.hasNextInt() != true ){
		System.out.println("\nEl valor '" + introducirEntero.next()  + "' No es valido, es un caracter o double ingrese otro: \n");
    }

dardosALanzar = introducirEntero.nextInt();

	while(dardosALanzar < 0){
		System.out.println("\nEl valor '" + dardosALanzar + "' No es valido, es un entero negativo, ingrese otro: \n");
		dardosALanzar = introducirEntero.nextInt();
    }



	while(dardosLanzados < dardosALanzar){
		abscisa = Math.random();
		ordenada = Math.random();
		distanciaAlOrigen = Math.pow(abscisa,2) + Math.pow(ordenada,2);

			if (distanciaAlOrigen <= 1.0){
				dardosDentro += 1;
				}
		dardosLanzados ++;
			}

estimacionPi = 4.0 * dardosDentro/dardosLanzados;


System.out.println("\nDardos lanzados: " + dardosLanzados);
System.out.println ("\nDardos que cayeron dentro del circulo: "+ dardosDentro);
System.out.printf("\nEstimacion de Pi: %.6f \n", estimacionPi);
		

	}
}