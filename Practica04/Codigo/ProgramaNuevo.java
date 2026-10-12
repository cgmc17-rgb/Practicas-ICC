
   public class ProgramaNuevo{	

	public static void main(String[] args) {


	 String producto = "Laptop para la carrera";
	 int precio = 15000;
	 int descuento = 3000;
	 double meses = 18.0;

	/*System.out.println("=== Ficha de compra ===");
	System.out.println("- Producto : " + producto);	
	System.out.println("- Precio con descuento : " + (precio - descuento));
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
	System.out.printf("- Pago mensual : %.2f\n", ((precio - descuento) / meses));
	System.out.println("=== Fin de la ficha ===");*/

	System.out.printf("=== Ficha de compra ===\n- Produto: %s\n- Precio con descuento: %d\n- Plazo de pago en anios: %.1f\n- Pago mensual : %.2f\n=== Fin de la ficha ===\n",producto,(precio - descuento),(meses / 12.0),((precio - descuento) / meses));

	}
}