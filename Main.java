import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//if (tipoPago.equals("tarjeta")) {
//    ...
//} else if (tipoPago.equals("paypal")) {
//    ...
//} else if (tipoPago.equals("efectivo")) {
//    ...
//} else {
//    System.out.println("Método de pago no válido");
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: Carrito de compras ===");
        CarritoCompras carrito = new CarritoCompras(150000);

        carrito.pagar(); // todavía no hay estrategia

        carrito.setMetodoPago(new PagoTarjeta("1234-5678"));
        carrito.pagar();

        carrito.setMetodoPago(new PagoPayPal("cliente@correo.com"));
        carrito.pagar();

        carrito.setMetodoPago(new PagoEfectivo());
        carrito.pagar();

        // Estrategia nueva: CarritoCompras no se modificó
        carrito.setMetodoPago(new PagoNequi("3001234567"));
        carrito.pagar();

    }
}
