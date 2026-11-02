import java.util.Scanner;

public class BinarioInteractivo{
	public static void main (String [] args){

int numeroIngresado;
char opcionPrograma = 'S';
String numeroBinario;
Scanner introducirEntero = new Scanner (System.in);

do{
	System.out.println("\n========DE ENTERO A BINARIO========\n");
	System.out.println("Ingrese el numero entero a convertir: \n");

while (introducirEntero.hasNextInt() != true ){
	System.out.println("\nEl valor '" + introducirEntero.next()  + "' No es valido, es un caracter o no es un numero entero ingrese otro: \n");
   }

numeroIngresado = introducirEntero.nextInt();

	while(numeroIngresado < 0){
		System.out.println("\nEl valor '" + numeroIngresado + "' No es valido, es un entero negativo, ingrese otro: \n");
		numeroIngresado = introducirEntero.nextInt(); 
    }

numeroBinario = "";

while (numeroIngresado/2  != 0){

		numeroBinario = (numeroIngresado%2) + numeroBinario;
		numeroIngresado = numeroIngresado/2;

}
		numeroBinario = (numeroIngresado%2) + numeroBinario;

System.out.println("EL NUMERO FINAL ES: " + numeroBinario);
System.out.println("\n=====DESEA CONVERTIR OTRO ENTERO A DECIMAL? =====");
System.out.println("\n\n-Presione S y 'Enter' para calcular otro entero");
System.out.println("\n\n-Presione cualquier otra letra y 'Enter' para terminar el programa\n");

opcionPrograma = introducirEntero.next().charAt(0);

}while(opcionPrograma == 'S' || opcionPrograma== 's');



System.out.println("========GRACIAS POR USAR EL PROGRAMA :3========");

}
}