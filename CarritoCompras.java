// Context: usa una estrategia sin saber cómo funciona por dentro
public class CarritoCompras {
    private MetodoPago metodoPago;
    private final double total;

    public CarritoCompras(double total) {
        this.total = total;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void pagar() {
        if (metodoPago == null) {
            System.out.println("Selecciona un método de pago primero");
        } else {
            metodoPago.pagar(total);
        }
    }
}
