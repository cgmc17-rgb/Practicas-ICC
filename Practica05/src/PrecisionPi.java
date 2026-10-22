public class PrecisionPi {

public static void main (String [] args){

	int dardosLanzados = 0;
	int dardosDentro =0;
	double abscisa;
	double ordenada;
	double distanciaAlOrigen;
	double toleranciaDePrecision = 0.0000001;
	double errorPi = toleranciaDePrecision;
	double estimacionPi=0.0;


	while(errorPi >= toleranciaDePrecision){
		abscisa = Math.random();
		ordenada = Math.random();
		
		distanciaAlOrigen = Math.pow(abscisa,2) + Math.pow(ordenada,2);
		
		

			if (distanciaAlOrigen <= 1.0){
				
				dardosDentro += 1;

				}
        dardosLanzados ++;

		estimacionPi = 4.0 * dardosDentro/dardosLanzados;
		errorPi=Math.abs(estimacionPi-Math.PI);

			}



System.out.println("========ESTIMACION DE PI A DARDAZOS========\n");
System.out.println("Dardos lanzados: " + dardosLanzados);
System.out.println ("\nDardos que cayeron dentro del circulo: "+ dardosDentro);
System.out.printf("\nEstimacion de Pi: %.6f", estimacionPi);
		



	}
}