public class Cotizador{
	
	public static void main (String [] args){

		int precioCliente1 =12899;	
		String cliente1 = "Robbie Valentino";
		String estadoCumplimientoCliente1 = "E";
		int mesesPagoCliente1 = 21;
		double intereses = precioCliente1*(15.0/100)*(mesesPagoCliente1/12.0);


			System.out.println("PRESTAMOS PINES");

			System.out.println("Estatus de "+ cliente1 + ": Cliente " + estadoCumplimientoCliente1);
			System.out.printf("\nPago de intereses al final del plazo: %.2f\n", intereses);
			System.out.printf("Total de monto a pagar: %.2f\n", precioCliente1+intereses);
			System.out.printf("Pago por meses: %.2f\n", (precioCliente1+intereses)/mesesPagoCliente1);





}


}