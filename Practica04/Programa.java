    /*Declaracion de clase publica Programa, es el contenedor que tiene adentro las variables y metodos que haran funcionar al programa
    */
        public class Program{	

 /* metodo main, importante ya que la maquina virtual de Java (JVM) empezara a leer todo lo que hemos programado, si este metodo falta, aunque el programa se compila sin problema, no se ejecutara de manera correcta*/       
	public static void main(String[] args) {

/*Declaracion de la variable producto, describe de que estamos hablando*/
	String producto = "Laptop para la carrera";

/*Declaracion de la variable precio, describe el precio del producto*/
	int precio = 15000;

/*Declaracion de la variable descuento, describe el descuento hecho al producto*/
	int descuento = 3000;

/*Declaracion de la variable meses, describe los meses en interes en que se puede pagar el producto*/
	double meses = 18.0;

//Imprime "=== ficha de compra ==="
	System.out.println("=== Ficha de compra ===");
    
// imprime la variable producto
	System.out.println("- Producto : " + producto);	
    
/*realiza la operacion de descuento al producto e imprime el resultado*/
	System.out.println("- Precio con descuento : " + (precio - descuento));

//Imprime el plazo en anios, calculandolo primero
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));

//Imprime pago en meses, calculandolo primero
	System.out.println("- Pago mensual : " + ((precio - descuento) / meses));


//Imprime "=== Fin de la ficha ==="
	System.out.println("=== Fin de la ficha ===");

	}
}