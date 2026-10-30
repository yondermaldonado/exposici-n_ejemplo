// ConcreteStrategy: pago con tarjeta
public class PagoTarjeta implements MetodoPago {
    private final String numeroTarjeta;

    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta " + numeroTarjeta);
    }
}
