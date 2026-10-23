public class CotizadorPines{
	
	public static void main (String [] args){

//Declaracion de varibales necesarias, segun el caso particular del programa.
		int precioCliente1 =12899;	
		String cliente1 = "Robbie Valentino";
		char estadoCumplimientoCliente1 = 'E';
		int mesesPagoCliente1 =21;
		double intereses=0.0;
		double saldoPorMes=precioCliente1;
		final double  TASA_DE_INTERES=15.0;
		double tasaAnual=0.0;



		if (precioCliente1 > 0 && mesesPagoCliente1 >0 && (estadoCumplimientoCliente1 == 'E' ||  estadoCumplimientoCliente1 == 'P' || estadoCumplimientoCliente1 == 'R')){

			//Detalle estetico
			System.out.println("========PRESTAMOS PINES========\n");

			// Estatus de cumplimiento del cliente
			System.out.println("Estatus de "+ cliente1 + ": Cliente " + estadoCumplimientoCliente1 + "\n");
			System.out.println("=====================================================================");
				if (estadoCumplimientoCliente1 == 'P'){
						tasaAnual = (TASA_DE_INTERES-2.0)/100.0;

				//	intereses = precioCliente1*(13.0/100)*(mesesPagoCliente1/12.0);

		}

 				else if (estadoCumplimientoCliente1 == 'E'){
					tasaAnual = (TASA_DE_INTERES)/100.0;
					//intereses = precioCliente1*(15.0/100)*(mesesPagoCliente1/12.0);

 		}

 				else if (estadoCumplimientoCliente1 == 'R'){
					tasaAnual = (TASA_DE_INTERES+2.0)/100.0;	
 					//intereses = precioCliente1*(17.0/100)*(mesesPagoCliente1/12.0);
 		}

 		intereses = precioCliente1*(tasaAnual)*(mesesPagoCliente1/12.0);

 			


 			for (int i=0; i<mesesPagoCliente1; i++){

 					saldoPorMes *= (1 +  tasaAnual/12.0);
 					System.out.printf("En el mes %d se tiene un saldo de: %.2f\n",i+1, saldoPorMes);
 			}
 				
				System.out.println("=====================================================================\n");
 				System.out.printf("\nTasa Aplicada %.2f porciento\n", TASA_DE_INTERES);

 				System.out.printf("\nPrestamo: $%d \n", precioCliente1);
 				System.out.printf("\nMeses de pago: %d\n", mesesPagoCliente1);

 				//Pago de intereses
				System.out.printf("\nInteres simple: $%.2f\n", intereses);

				//Total de monto a pagar,  
				System.out.printf("\nTotal con interes simple: $%.2f\n", precioCliente1 + intereses);
				System.out.printf("\nInteres compuesto: $%.2f\n", saldoPorMes - precioCliente1);

 				System.out.printf("\nTotal con interes compuesto: $%.2f\n", precioCliente1*Math.pow(1+ tasaAnual/12.0,21));

			//mismo caso que el printf anterior
			//System.out.printf("Pago por meses: %.2f\n", (precioCliente1+intereses)/mesesPagoCliente1);

			/*El programa puede mejorarse, pero solo hasta que el cliente lo requierra*/

	}		

//Ejecucion a realizar si al programa se le ingresan datos erroneos
else {

	System.out.println("==DATOS NO VALIDOS==\n");
	System.out.println("Detalles:\n");

		if(precioCliente1 < 0){
			System.out.println("-Valor no valido para la cantidad necesitada de prestamo.\n");
		}

		if(mesesPagoCliente1 < 0){
			System.out.println("-Meses no validos para el pago del prestamo.\n");
		}
		if(estadoCumplimientoCliente1 != 'E' &&  estadoCumplimientoCliente1 != 'P' && estadoCumplimientoCliente1 != 'R'){
			System.out.println("-No se ingreso un estado del cliente valido.\n");
		}
	
}




}


}