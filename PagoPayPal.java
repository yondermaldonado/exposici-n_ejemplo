// ConcreteStrategy: pago con PayPal
public class PagoPayPal implements MetodoPago {
    private final String correo;

    public PagoPayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal (" + correo + ")");
    }
}
