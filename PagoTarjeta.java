public class PagoTarjeta implements MetodoPago {
    private String numeroTarjeta;
    private String cvv;
    private String fechaExpiracion;

    public PagoTarjeta(String numeroTarjeta, String cvv, String fechaExpiracion) {
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
    }

    public boolean validarTarjeta() {
        return numeroTarjeta != null && numeroTarjeta.length() == 16 && cvv.length() == 3;
    }

    @Override
    public boolean procesarPago() {
        if (validarTarjeta()) {
            System.out.println("Pago con tarjeta procesado exitosamente.");
            return true;
        }
        System.out.println("Falló la validación de la tarjeta.");
        return false;
    }
    public String getNumeroTarjeta() { 
        return numeroTarjeta; }
    public void setNumeroTarjeta(String numeroTarjeta) { 
        this.numeroTarjeta = numeroTarjeta; }
    public String getCvv() { 
        return cvv; }
    public void setCvv(String cvv) { 
        this.cvv = cvv; }
    public String getFechaExpiracion() { 
        return fechaExpiracion; }
    public void setFechaExpiracion(String fechaExpiracion) { 
        this.fechaExpiracion = fechaExpiracion; }
}
