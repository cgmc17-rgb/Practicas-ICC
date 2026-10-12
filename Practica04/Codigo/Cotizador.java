public class Cotizador{
	
	public static void main (String [] args){

/*Declaracion de varibales necesarias, segun el caso particular del programa
No se declaro variable para el interes anual ni el dato 12 meses, puesto que para este punto
solo todos pagan 15 porciento anual sumado a que al ser anual, siempre se realiza el calculo
con 12 meses.

el estado del cumplimiento del cliente, lo colocamos en un string, sin mas, pues de nuevo
un solo estado para un solo cliente, despues podriamos usar un valor numerico con ayuda de algun
if/else, que determine segun alguna condicion, que es cumplido, pero es trabajo a parte.
*/
		int precioCliente1 =12899;	
		String cliente1 = "Robbie Valentino";
		String estadoCumplimientoCliente1 = "E";
		int mesesPagoCliente1 = 21;
		double intereses = precioCliente1*(15.0/100)*(mesesPagoCliente1/12.0);


//Detalle estetico
			System.out.println("PRESTAMOS PINES");

// Estatus de complimiento del cliente
			System.out.println("Estatus de "+ cliente1 + ": Cliente " + estadoCumplimientoCliente1);

//Pago de intereses
			System.out.printf("\nPago de intereses al final del plazo: %.2f\n", intereses);

/*Total de monto a pagar, al ser un solo cliente, puede calcularse en el mismo printf
para futuro podriamos crear una variable que guarde los precios totales que cada cliente paga
para imprimir mas facil, pero de nuevo, es un trabajo a parte. 
*/
			System.out.printf("Total de monto a pagar: %.2f\n", precioCliente1+intereses);

//mismo caso que el printf anterior
			System.out.printf("Pago por meses: %.2f\n", (precioCliente1+intereses)/mesesPagoCliente1);


/*El programa puede mejorarse, pero solo hasta que el cliente lo requierra*/


}


}