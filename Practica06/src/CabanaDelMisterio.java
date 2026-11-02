import java.util.Scanner;


public class CabanaDelMisterio{
	
	public static void main (String [] args){

//Declaracion de varibales necesarias, segun el caso particular del programa.

int mesesPagoCliente=0;
int contadorErrores=0;
int opcionMenu=0;
int operacionEfectiva=0;

double capitalPrestado=0.0;
double interesSimple=0.0;
double interesCompuesto=0.0;
double tasaDeInteres=0.0;
double tasaAnual=0.0;
double totalCompuesto=0.0;
double totalSimple=0.0;
double saldoPorMes=0.0;

char estadoCliente = 'N';

boolean numeroValido = true;

String nombreCliente = "";

Scanner datosCliente = new Scanner (System.in);




System.out.println("\n\nIngrese el nombre del cliente: ");
nombreCliente = datosCliente.nextLine();

System.out.println("\nIngrese el tipo de cliente: ");
estadoCliente = datosCliente.next().charAt(0);

		
	while( estadoCliente != 'E' &&  estadoCliente != 'P' && estadoCliente != 'R'){	
		if (++contadorErrores >= 3){ break;}
			System.out.println("\n '"+ estadoCliente + "' No es un estado de cliente valido, ingrese otro:");
			estadoCliente = datosCliente.next().charAt(0);
	}

	if (contadorErrores < 3){System.out.println("\nIngrese el prestamo a realizar: ");
	}
		
	while (datosCliente.hasNextDouble() != true ){
		if (++contadorErrores >= 3){ break;}	
		System.out.println("\nEl valor '" + datosCliente.next()  + " Es un caracter, dato no valido ingrese otro: \n");	
    }

    if (contadorErrores < 3){  

    capitalPrestado = datosCliente.nextDouble();
	}

    while(capitalPrestado < 0 ){
    	if (++contadorErrores >= 3){ break;}
		System.out.println("\nEl valor '" + capitalPrestado  + "' Es un numero negativo, dato no valido ingrese otro: \n");
		capitalPrestado = datosCliente.nextDouble();
 	}

	if (contadorErrores < 3){System.out.println("\nIngrese los meses de interes: ");
		numeroValido = datosCliente.hasNextInt();
	}
	
	while (numeroValido != true ){
		if (++contadorErrores >= 3){ break;}
		System.out.println("\nEl valor '" + datosCliente.next()  + "' Es un caracter o un decimal, dato no valido ingrese otro: \n");
		numeroValido = datosCliente.hasNextInt();
    }

    if (contadorErrores < 3 ){mesesPagoCliente = datosCliente.nextInt();
	}

    while(mesesPagoCliente < 0 && contadorErrores < 3){
    	if (++contadorErrores >= 3){ break;}
		System.out.println("\nEl valor '" + mesesPagoCliente  + "' Es negativo, ingrese otro valor valido: \n");
		mesesPagoCliente = datosCliente.nextInt();
 	}



 	if (contadorErrores < 3){System.out.println("\nIngrese la tasa de interes");
		numeroValido = datosCliente.hasNextDouble();
	}
	
	while (numeroValido != true ){
		if (++contadorErrores >= 3){ break;}
		System.out.println("\nEl valor '" + datosCliente.next()  + "' Es un caracter, dato no valido, ingrese otro: \n");
		numeroValido = datosCliente.hasNextDouble();
    }

    if (contadorErrores < 3 ){tasaDeInteres = datosCliente.nextDouble();
	}

    while(tasaDeInteres < 0 && contadorErrores < 3){
    	if (++contadorErrores >= 3){ break;}
		System.out.println("\nEl valor '" + tasaDeInteres  + "' Es negativo, dato no valido, ingrese otro: \n");
		tasaDeInteres = datosCliente.nextDouble();
 	}


	if (estadoCliente == 'P'){
					tasaAnual = (tasaDeInteres-2.0)/100.0;
	}

 	else if (estadoCliente == 'E'){
					tasaAnual = (tasaDeInteres)/100.0;
	}

 	else if (estadoCliente == 'R'){
					tasaAnual = (tasaDeInteres+2.0)/100.0;	
 	}

 	interesSimple = capitalPrestado*(tasaAnual)*(mesesPagoCliente/12.0);
 	totalSimple = interesSimple + capitalPrestado;

 	totalCompuesto = capitalPrestado*Math.pow(1+ tasaAnual/12.0,mesesPagoCliente);
 	interesCompuesto = totalCompuesto - capitalPrestado;


while (contadorErrores < 3  && operacionEfectiva < 5){

contadorErrores =0;
System.out.println("\n\n====SISTEMA DE PRESTAMOS====");

System.out.println("\nOpciones disponiles: ");
System.out.println("\n1) Cotizar con interes simple.");
System.out.println("\n2) Cotizar con interes compuesto.");
System.out.println("\n3) Comparar interes simple y compuesto.");
System.out.println("\n4) Cambiar el capital del prestamo");
System.out.println("\n0) Salir.");
System.out.println("\nPor Favor elige una opcion: ");

numeroValido = datosCliente.hasNextInt();
	
	while (numeroValido != true ){
		if (++contadorErrores >= 3){ break;}
		System.out.println("\nEl valor '" + datosCliente.next()  + "' No es valido, ingrese otro: \n");
		numeroValido = datosCliente.hasNextInt();
    }

    if (contadorErrores < 3 ){opcionMenu = datosCliente.nextInt();
	}

    while(opcionMenu < 0 ){
    	if (++contadorErrores >= 3){ break;}
		System.out.println("-Valor negativo, no valido.\n");
		opcionMenu = datosCliente.nextInt();
 	}

		if (contadorErrores == 3 ){break;}







if (opcionMenu == 1 || opcionMenu == 2){

	if (opcionMenu ==1){
	System.out.println("\n\n====Opcion 1 : Cotizacion de interes simple====\n\n");}

	else if (opcionMenu ==2){
	System.out.println("\n\n====Opcion 2 : Cotizacion de interes Compuesto====\n\n");}



	System.out.println("Nombre : "+ nombreCliente);

	if(estadoCliente == 'E'){ System.out.println("Tipo de Cliente: Estandar");}
	else if(estadoCliente == 'P'){ System.out.println("Tipo de Cliente: Preferente");}
	else if(estadoCliente == 'R'){ System.out.println("Tipo de Cliente: Riesgoso");}

	System.out.println("Capital de prestamo: "+ capitalPrestado);

	System.out.println("Tasa anual: "+ tasaDeInteres);
	System.out.println("Plazo a meses: "+ mesesPagoCliente);



	if (opcionMenu == 1){

		System.out.printf("\nInteres simple: $%.2f\n", interesSimple);
		System.out.printf("\nTotal con interes simple: $%.2f\n", totalSimple);
	}
		else if (opcionMenu ==2){
	saldoPorMes=capitalPrestado;
	for (int i=0; i<mesesPagoCliente; i++){

 					saldoPorMes *= (1 +  tasaAnual/12.0);
 					System.out.printf("En el mes %d se tiene un saldo de: %.2f\n",i+1, saldoPorMes);
 			}


		System.out.printf("\nInteres compuesto: $%.2f\n", interesCompuesto);
		System.out.printf("\nTotal con interes compuesto: $%.2f\n", totalCompuesto);

		}
	
operacionEfectiva++;
}


else if (opcionMenu == 3){
	System.out.printf("\nInteres simple: $%.2f\n", interesSimple);
		
    System.out.printf("\nInteres compuesto: $%.2f\n", interesCompuesto);

    System.out.printf("\nLa diferencia entre ellos es: $%.2f\n", Math.abs(interesCompuesto - interesSimple));

    if(interesCompuesto > interesSimple){
    	System.out.println("El interes compuesto es mayor");
    }

    else {
    	System.out.println("El interes simple es mayor");
    }
		
		operacionEfectiva++;
}


else if (opcionMenu == 4){

System.out.println("Ingrese el nuevo prestamo: ");

	while (datosCliente.hasNextDouble() != true ){
		
		System.out.println("\nEl valor '" + datosCliente.next()  + "' No es valido, ingrese otro: \n");
    }

    capitalPrestado = datosCliente.nextDouble();
	

    while(capitalPrestado < 0 ){
		System.out.println("-Valor no valido para la cantidad necesitada de prestamo.\n");
		capitalPrestado = datosCliente.nextDouble();
 	}


if (estadoCliente == 'P'){
					tasaAnual = (tasaDeInteres-2.0)/100.0;
	}

 	else if (estadoCliente == 'E'){
					tasaAnual = (tasaDeInteres)/100.0;
	}

 	else if (estadoCliente == 'R'){
					tasaAnual = (tasaDeInteres+2.0)/100.0;	
 	}

 	interesSimple = capitalPrestado*(tasaAnual)*(mesesPagoCliente/12.0);
 	totalSimple = interesSimple + capitalPrestado;
 	totalCompuesto = capitalPrestado*Math.pow(1+ tasaAnual/12.0,mesesPagoCliente);
 	interesCompuesto = totalCompuesto - capitalPrestado;



	System.out.printf("\nInteres simple: $%.2f\n", interesSimple);
		
    System.out.printf("\nInteres compuesto: $%.2f\n", interesCompuesto);

    System.out.printf("\nLa diferencia entre ellos es: $%.2f\n", Math.abs(interesCompuesto - interesSimple));


	System.out.printf("\nTotal con interes simple: $%.2f\n", totalSimple);
	System.out.printf("\nTotal con interes compuesto: $%.2f\n", totalCompuesto);
  
	operacionEfectiva++;
	}


	else if (opcionMenu == 0){
		break;
	}
}


	System.out.println("\n\n====RESUMEN DEL PROGRAMA====\n");
	System.out.println("Nombre : "+ nombreCliente);
	System.out.println("Numero de errores en la ultima ejecucion "+ contadorErrores);
	System.out.println("Numero de operaciones efectivas en la ultima ejecucion "+ operacionEfectiva);
	System.out.println("Capital de prestamo: "+ capitalPrestado);


if (contadorErrores >= 3){
	System.out.println("\n--Programa terminado por cantidad de errores--");
}

else if (operacionEfectiva == 5) {
	System.out.println("\n--Programa terminado por cantidad de operaciones efectivas--");
}

else {
System.out.println("\n--Programa terminado por el usuario--");
}


System.out.println("\n\n====== GRACIAS POR USAR EL PROGRAMA :) ======");


}


}