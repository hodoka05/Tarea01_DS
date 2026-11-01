public class PagoEfectivo implements MetodoPago{
    private double monto;
    private double cambio;

    public PagoEfectivo(double monto, double cambio) {
        this.monto = monto;
        this.cambio = cambio;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Pago en efectivo procesado por un monto de: " + monto);
        return true;
    }
    public double getMonto() { 
        return monto; }
    public void setMonto(double monto) { 
        this.monto = monto; }
    public double getCambio() { 
        return cambio; }
    public void setCambio(double cambio) { 
        this.cambio = cambio; }
}
