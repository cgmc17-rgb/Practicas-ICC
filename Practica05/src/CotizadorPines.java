public class CotizadorPines{
	
	public static void main (String [] args){

//Declaracion de varibales necesarias, segun el caso particular del programa.
		int precioCliente1 =-12899;	
		String cliente1 = "Robbie Valentino";
		char estadoCumplimientoCliente1 = 'A';
		int mesesPagoCliente1 = -21;
		double intereses=0.0;


		if (precioCliente1 > 0 && mesesPagoCliente1 >0 && (estadoCumplimientoCliente1 == 'E' ||  estadoCumplimientoCliente1 == 'P' || estadoCumplimientoCliente1 == 'R')){

			//Detalle estetico
			System.out.println("========PRESTAMOS PINES========\n");

			// Estatus de cumplimiento del cliente
			System.out.println("Estatus de "+ cliente1 + ": Cliente " + estadoCumplimientoCliente1);

				if (estadoCumplimientoCliente1 == 'P'){

					intereses = precioCliente1*(13.0/100)*(mesesPagoCliente1/12.0);

		}

 				else if (estadoCumplimientoCliente1 == 'E'){

					intereses = precioCliente1*(15.0/100)*(mesesPagoCliente1/12.0);

 		}

 				else if (estadoCumplimientoCliente1 == 'R'){

 					intereses = precioCliente1*(17.0/100)*(mesesPagoCliente1/12.0);
 		}

 			System.out.printf("\nDinero prestado: %d\n", precioCliente1);

			//Pago de intereses
			System.out.printf("\nPago de intereses al final del plazo: %.2f\n", intereses);

			//Total de monto a pagar,  

			System.out.printf("Total de monto a pagar: %.2f\n", precioCliente1+intereses);

			//mismo caso que el printf anterior
			System.out.printf("Pago por meses: %.2f\n", (precioCliente1+intereses)/mesesPagoCliente1);

			/*El programa puede mejorarse, pero solo hasta que el cliente lo requierra*/}


else {

	System.out.println("==DATOS NO VALIDOS==\n");
	System.out.println("Detalles:\n");

		if(precioCliente1 < 0){
			System.out.println("-Valor no válido para la cantidad necesitada de prestamo\n");
		}

		if(mesesPagoCliente1 < 0){
			System.out.println("-Meses no validos para el pago del prestamo\n");
		}
		if(estadoCumplimientoCliente1 != 'E' ||  estadoCumplimientoCliente1 != 'P' || estadoCumplimientoCliente1 != 'R'){
			System.out.println("-No se ingreso un estado del cliente valido\n");
		}
	
}






}


}