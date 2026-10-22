public class EstimacionPi {

public static void main (String [] args){

	int dardosALanzar = 1000000;
	int dardosLanzados = 0;
	int dardosDentro =0;
	double abscisa;
	double ordenada;
	double distanciaAlOrigen;
	double estimacionPi;

if (dardosALanzar > 0){
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

System.out.println("========ESTIMACION DE PI A DARDAZOS========\n");
System.out.println("Dardos lanzados: " + dardosLanzados);
System.out.println ("\nDardos que cayeron dentro del circulo: "+ dardosDentro);
System.out.printf("\nEstimacion de Pi: %.6f", estimacionPi);
		}

else{

System.out.println ("No podemos lanzar una cantidad vacia o negatica de dardos");

		}

	}
}